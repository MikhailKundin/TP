import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Введите входную строку и ее итоговую версию:");
		String str = in.next();
		String fullStr = in.next();
		
		in.close();
		
		System.out.println(canComplete(str, fullStr));
	}

	public static boolean canComplete(String str, String fullStr)
	{
		int j = 0;
		for (int i = 0; i < fullStr.length(); i++)
		{
			if (j >= str.length())
			{
				return true;
			}
			
			char ch = fullStr.charAt(i);
			if (ch == str.charAt(j))
			{
				j++;
			}
		}
		
		if (j == str.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
