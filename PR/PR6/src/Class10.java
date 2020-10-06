import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(palindromeDescendant(n));
	}

	public static boolean palindromeDescendant(int n)
	{
		String str = Integer.toString(n);
		while (true)
		{
			if (str.length() < 2)
			{
				return false;
			}
			
			if (str.length() % 2 != 0)
			{
				if (str.substring(0, str.length()/2).equals(new StringBuilder(str.substring(str.length()/2+1)).reverse().toString()))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			if (str.substring(0, str.length()/2).equals(new StringBuilder(str.substring(str.length()/2)).reverse().toString()))
			{
				return true;
			}
			else
			{
				String buff = "";
				for (int i = 0; i < str.length(); i += 2)
				{
					buff += Integer.toString(Integer.parseInt(Character.toString(str.charAt(i))) +
							Integer.parseInt(Character.toString(str.charAt(i+1))));
				}
				str = buff;
			}
		}
	}
}
