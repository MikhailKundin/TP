import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите слово и префикс/суффикс:");
		String word = in.next();
		String str = in.next();
		
		in.close();
		
		if (str.charAt(0) == '-')
		{
			System.out.println(isSuffix(word, str));
		}
		else
		{
			System.out.println(isPrefix(word, str));
		}
	}

	public static boolean isSuffix(String word, String str)
	{
		str = str.substring(1);
		if (word.endsWith(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrefix(String word, String str)
	{
		str = str.substring(0, str.length()-1);
		if (word.startsWith(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
