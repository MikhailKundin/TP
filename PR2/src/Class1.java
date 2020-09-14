import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку и число:");
		String str = in.next();
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(repeat(str, n));
	}

	public static String repeat(String str, int n)
	{
		String res = "";
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			for (int j = 0; j < n; j++)
			{
				res += ch;
			}
		}
		
		return res;
	}
}
