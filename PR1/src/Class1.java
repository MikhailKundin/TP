import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ��� �����:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		System.out.printf("������� �� �������: %d", remainder(a, b));
	}

	public static int remainder(int a, int b)
	{
		return a % b;
	}
}
