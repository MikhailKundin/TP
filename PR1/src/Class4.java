import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите три числа:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		in.close();
		
		System.out.printf("–езультат: %b", profitableGamble(a, b, c));
	}

	public static boolean profitableGamble(double a, double b, double c)
	{
		return a*b > c ? true : false;
	}
}