import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.print(addUpTo(n));
	}

	public static int addUpTo(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		return sum;
	}
}