import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите номер шага:");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println(boxSeq(n));
	}

	public static int boxSeq(int n)
	{
		if (n % 2 == 0)
		{
			return n;
		}
		else
		{
			return n+2;
		}
	}
}
