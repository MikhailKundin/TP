import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(bugger(n));
	}

	public static int bugger(int n)
	{
		int count = 0;
		String str = Integer.toString(n);
		
		while (str.length() > 1)
		{
			count++;
			
			int val = 1;
			for (int i = 0; i < str.length(); i++)
			{
				val *= Integer.parseInt((str.substring(i, i+1)));
			}
			
			str = Integer.toString(val);
		}
		
		return count;
	}
}
