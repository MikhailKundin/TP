import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int num = in.nextInt();
		
		in.close();
		
		System.out.println(checkPerfect(num));
	}

	public static boolean checkPerfect(int num)
	{
		int sum = 1;
		int n = (int)Math.ceil(Math.sqrt(num));
		
		for (int i = 2; i < n; i++)
		{
			if (num % i == 0)
			{
				n = num / i;
				sum += i;
				sum += n;
				
				if (sum > num)
				{
					return false;
				}
			}
		}
		
		if (sum != num)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
