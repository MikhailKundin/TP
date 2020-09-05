import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите два слова:");
		String str1 = in.next();
		String str2 = in.next();
		
		in.close();
		
		System.out.println(isStrangePair(str1, str2));
	}

	public static boolean isStrangePair(String str1, String str2)
	{
		if (str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length()-1) == str2.charAt(0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
