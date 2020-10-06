import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.next();
		
		in.close();
		
		System.out.println(split(str));
	}

	public static String split(String str)
	{
		String res = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			res += ch;
			
			if (ch == '(')
			{
				count++;
			}
			else
			{
				count--;
			}
			
			if (count == 0)
			{
				res += ' ';
			}
		}
		
		return res;
	}
}
