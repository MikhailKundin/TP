import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(nextPrime(n));
	}

	public static int nextPrime(int n)
	{
		if (n == 2)
		{
			return n;
		}
		
		if (n % 2 == 0)
		{
			n++;
		}
		
		while (true)
		{
			int end = (int)Math.ceil(Math.sqrt(n));
			int i;
			for (i = 2; i <= end; i++)
			{
				if (n % i == 0)
				{
					break;
				}
			}
			
			if (i == end+1)
			{
				break;
			}
			else
			{
				n += 2;
			}
		}
		
		return n;
	}
}
