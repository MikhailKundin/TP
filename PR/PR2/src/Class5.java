import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		String str = in.next();
		
		in.close();
		
		System.out.println(getDecimalPlaces(str));
	}
	
	public static int getDecimalPlaces(String str)
	{
		if (str.contains("."))
		{
			return str.length() - 1 - str.indexOf('.');
		}
		else
		{
			return 0;
		}
	}
}
