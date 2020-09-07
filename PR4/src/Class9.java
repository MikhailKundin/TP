import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите два числа:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		System.out.println(trouble(a, b));
	}

	public static boolean trouble(int a, int b)
	{
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		char number = '\0';
		int count = 0;
		
		for (int i = 0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			if (ch == number)
			{
				count++;
			}
			else
			{
				number = ch;
				count = 0;
			}
			if (count == 2)
			{
				if (str2.indexOf(String.copyValueOf(new char[] {number, number})) != -1)
				{
					return true;
				}
				else
				{
					count = 0;
				}
			}
		}
		
		return false;
	}
}
