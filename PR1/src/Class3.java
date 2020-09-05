import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество куриц, коров и свиней:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		System.out.printf("Общее количество ног: %d", animals(a, b, c));
	}
	
	public static int animals(int a, int b, int c)
	{
		return a*2 + b*4 + c*4;
	}
}
