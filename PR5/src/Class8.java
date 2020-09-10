import java.util.Scanner;
import java.util.ArrayList;

public class Class8 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(getSha256Hash(str));
	}

	public static String getSha256Hash(String str)
	{
		String binStr = "";
		String buff = "";
		for (int i = 0; i < str.length(); i++)
		{
			buff = Integer.toBinaryString(str.charAt(i));
			for (int j = 0; j < 8 - buff.length(); j++)
			{
				binStr += '0';
			}
			binStr += buff;
		}
		int length = binStr.length();
		
		binStr += '1';
		
		while ((binStr.length()+64) % 512 != 0)
		{
			binStr += '0';
		}
		
		buff = Integer.toBinaryString(length);
		for (int i = 0; i < 64-buff.length(); i++)
		{
			binStr += '0';
		}
		binStr += buff;
		
		int[] hArr = {0x6a09e667, 0xbb67ae85, 0x3c6ef372, 0xa54ff53a, 0x510e527f, 0x9b05688c, 0x1f83d9ab, 0x5be0cd19};

		int[] k = {0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5,
				   0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174,
				   0xe49b69c1, 0xefbe4786, 0x0fc19dc6, 0x240ca1cc, 0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da,
				   0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 0x06ca6351, 0x14292967,
				   0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85,
				   0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070,
				   0x19a4c116, 0x1e376c08, 0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3,
				   0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2};
		
		buff = "";
		for (int i = 0; i < binStr.length()-512; i+=512)
		{
			buff += binStr.substring(i, i+512);
			buff += " ";
		}
		buff += binStr.substring(binStr.length()-512);
		String[] blocks = buff.split(" ");
		
		for (String block : blocks)
		{
			buff = "";
			for (int i = 1; i <= block.length(); i++)
			{
				buff += block.charAt(i-1);
				if (i % 32 == 0)
				{
					buff += ' ';
				}
			}
			block = buff;
			
			for (int i = 0; i < 48; i++)
			{
				block += "00000000000000000000000000000000 ";
			}
			
			String[] wordArrStr = block.split(" ");
			ArrayList<Integer> wordArr = new ArrayList<>(wordArrStr.length);
			for (int i = 0; i < wordArrStr.length; i++)
			{
				wordArr.add(Integer.parseUnsignedInt(wordArrStr[i], 2));
			}
			
			for (int i = 16; i < 64; i++)
			{
				int val1 = wordArr.get(i-15);
				int val2 = wordArr.get(i-2);
				
				int s0 = (((val1>>7) & (int)Math.pow(2, 32-7)-1) | (val1<<32-7)) ^
						 (((val1>>18) & (int)Math.pow(2, 32-18)-1) | (val1<<32-18)) ^
						 ((val1>>3) & (int)Math.pow(2, 32-3)-1);
				int s1 = (((val2>>17) & (int)Math.pow(2, 32-17)-1) | (val2<<32-17)) ^
						 (((val2>>19) & (int)Math.pow(2, 32-19)-1) | (val2<<32-19)) ^
						 ((val2>>10) & (int)Math.pow(2, 32-10)-1);
				wordArr.set(i, s0 + s1 + wordArr.get(i-16) + wordArr.get(i-7));
			}
			
			int a = hArr[0];
			int b = hArr[1];
			int c = hArr[2];
			int d = hArr[3];
			int e = hArr[4];
			int f = hArr[5];
			int g = hArr[6];
			int h = hArr[7];
			
			for (int i = 0; i < 64; i++)
			{
				int s1 = (((e>>6) & (int)Math.pow(2, 32-6)-1) | (e<<32-6)) ^
						 (((e>>11) & (int)Math.pow(2, 32-11)-1) | (e<<32-11)) ^
						 (((e>>25) & (int)Math.pow(2, 32-25)-1) | (e<<32-25));
				int ch = (e & f) ^ (~e & g);
				int temp1 = h + s1 + ch + k[i] + wordArr.get(i);
				int s0 = (((a>>2) & (int)Math.pow(2, 32-2)-1) | (a<<32-2)) ^
						 (((a>>13) & (int)Math.pow(2, 32-13)-1) | (a<<32-13)) ^
						 (((a>>22) & (int)Math.pow(2, 32-22)-1) | (a<<32-22));
				int maj = (a & b) ^ (a & c) ^ (b & c);
				int temp2 = s0 + maj;
				h = g;
				g = f;
				f = e;
				e = d + temp1;
				d = c;
				c = b;
				b = a;
				a = temp1 + temp2;
			}
			
			hArr[0] += a;
			hArr[1] += b;
			hArr[2] += c;
			hArr[3] += d;
			hArr[4] += e;
			hArr[5] += f;
			hArr[6] += g;
			hArr[7] += h;
		}
			
		String res = Integer.toHexString(hArr[0]) + Integer.toHexString(hArr[1]) +
					 Integer.toHexString(hArr[2]) + Integer.toHexString(hArr[3]) +
					 Integer.toHexString(hArr[4]) + Integer.toHexString(hArr[5]) +
					 Integer.toHexString(hArr[6]) + Integer.toHexString(hArr[7]);
		
		return res;
	}
}
