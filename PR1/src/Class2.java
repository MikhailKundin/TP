import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������ � ��������� ������������:");
		int h = in.nextInt();
		int l = in.nextInt();
		
		in.close();
		
		System.out.printf("������� ������������: %f", triArea(h, l));
	}
	
	public static double triArea(int h, int l)
	{
		return h * l / 2.0;
	}
}
