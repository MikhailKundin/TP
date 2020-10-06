import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.next();
		
		in.close();
		
		System.out.println(toStarShorthand(str));
	}

	public static String toStarShorthand(String str)
	{
		String res = "";
		int count = 1;
		char ch = '\0';
		
		for (int i = 0; i < str.length(); i++)
		{
			char newCh = str.charAt(i);
			
			if (newCh == ch)
			{
				count++;
			}
			else
			{
				if (count != 1)
				{
					res += '*';
					res += Integer.toString(count);
					count = 1;
				}
				res += newCh;
				ch = newCh;
			}
		}
		if (count != 1)
		{
			res += '*';
			res += Integer.toString(count);
		}
		
		return res;
	}
}
