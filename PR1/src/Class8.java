import java.util.Scanner;

public class Class8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������� ������������:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		System.out.printf("������������ ����� ������� ������� %d", nextEdge(a, b));
	}
	
	public static int nextEdge(int a, int b)
	{
		return a + b - 1;
	}
}
