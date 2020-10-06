import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.next();
		
		in.close();
		
		if (str.indexOf('_') != -1)
		{
			System.out.println(toCamelCase(str));
		}
		else
		{
			System.out.println(toSnakeCase(str));
		}
	}

	public static String toCamelCase(String str)
	{
		String res = "";
		boolean newWord = false;
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == '_')
			{
				newWord = true;
			}
			else if (newWord)
			{
				newWord = false;
				res += (char)(ch-32);
			}
			else
			{
				res += ch;
			}
		}
		
		return res;
	}
	
	public static String toSnakeCase(String str)
	{
		String res = "";
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				res += '_';
				res += (char)(ch+32);
			}
			else
			{
				res += ch;
			}
		}
		
		return res;
	}
}
