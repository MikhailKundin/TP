import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(isKaprekar(n));
	}

	public static boolean isKaprekar(int n)
	{
		String nn = Integer.toString(n*n);
		String str = "";
		if (nn.length() == 1)
		{
			str += "0";
		}
		str += nn;
		int end = str.length()/2;
		int n1 = Integer.parseInt(str.substring(0, end));
		int n2 = Integer.parseInt(str.substring(end, str.length()));
		
		if (n1 + n2 == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
