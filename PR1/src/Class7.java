import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.printf("—умма равна %d", addUpTo(n));
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