import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите три числа:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		System.out.println(abcMath(a, b, c));
	}
	
	public static boolean abcMath(int a, int b, int c)
	{
		for (int i = 0; i < b; i++)
		{
			a += a;
		}
		if (a % c == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
