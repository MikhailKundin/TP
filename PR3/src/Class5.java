import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите шестнадцатеричный код:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(isValidHexCode(str));
	}

	public static boolean isValidHexCode(String str)
	{
		if (str.length() != 7 || str.charAt(0) != '#')
		{
			return false;
		}
		
		for (int i = 1; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f'))
			{
				return false;
			}
		}
		
		return true;
	}
}
