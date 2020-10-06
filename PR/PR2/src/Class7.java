import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите почтовый индекс:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(isValid(str));
	}

	public static boolean isValid(String str)
	{
		if (str.length() != 5)
		{
			return false;
		}
		
		for (int i = 0; i < 5; i++)
		{
			if (str.codePointAt(i) < '0' || str.codePointAt(i) > '9')
			{
				return false;
			}
		}
		
		return true;
	}
}
