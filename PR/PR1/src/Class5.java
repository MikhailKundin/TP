import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите три числа:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		System.out.println(operation(a, b, c));
	}

	public static String operation(int a, int b, int c)
	{
		if (b + c == a)
			return "added";
		else if (b - c == a)
			return "subtracted";
		else if (b * c == a)
			return "multiplied";
		else if (b / c == a)
			return "divided";
		else
			return "none";
	}
}