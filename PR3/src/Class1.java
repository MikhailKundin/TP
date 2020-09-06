import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите значения a, b и c:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		System.out.println(solutions(a, b, c));
	}

	public static int solutions(int a, int b, int c)
	{
		double d = b*b - 4*a*c;
		if (d < 0)
		{
			return 0;
		}
		else if (d == 0)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}
