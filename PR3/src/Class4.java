import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(flipEndChars(str));
	}

	public static String flipEndChars(String str)
	{
		if (str.length() < 2)
		{
			return "Incompatible.";
		}
		
		char cBegin = str.charAt(0);
		char cEnd = str.charAt(str.length()-1);
		if (cBegin == cEnd)
		{
			return "Two's a pair.";
		}
		
		return cEnd + str.substring(1, str.length()-1) + cBegin;
	}
}
