import java.util.Scanner;
import java.util.Stack;

public class Class8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(convertToRoman(n));
	}

	public static String convertToRoman(int n)
	{
		if (n > 3999)
		{
			return "";
		}
		
		Stack<String> res = new Stack<>();
		for (int i = 0; i < 4 && n > 0; i++)
		{
			char ch1, ch2, ch3;
			switch (i)
			{
			case 0:
				ch1 = 'I';
				ch2 = 'V';
				ch3 = 'X';
				break;
			case 1:
				ch1 = 'X';
				ch2 = 'L';
				ch3 = 'C';
				break;
			case 2:
				ch1 = 'C';
				ch2 = 'D';
				ch3 = 'M';
				break;
			default:
				ch1 = 'M';
				ch2 = 'M';
				ch3 = 'M';
			}
			
			switch (n % 10)
			{
			case 1:
				res.push(Character.toString(ch1));
				break;
			case 2:
				res.push(Character.toString(ch1) + Character.toString(ch1));
				break;
			case 3:
				res.push(Character.toString(ch1) + Character.toString(ch1) + Character.toString(ch1));
				break;
			case 4:
				res.push(Character.toString(ch1) + Character.toString(ch2));
				break;
			case 5:
				res.push(Character.toString(ch2));
				break;
			case 6:
				res.push(Character.toString(ch2) + Character.toString(ch1));
				break;
			case 7:
				res.push(Character.toString(ch2) + Character.toString(ch1) + Character.toString(ch1));
				break;
			case 8:
				res.push(Character.toString(ch2) + Character.toString(ch1) + Character.toString(ch1) + Character.toString(ch1));
				break;
			case 9:
				res.push(Character.toString(ch1) + Character.toString(ch3));
				break;
			}
			n /= 10;
		}
		
		String str = "";
		while (res.size() > 0)
		{
			str += res.pop();
		}
		
		return str;
	}
}
