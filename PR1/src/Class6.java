import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������:");
		String a = in.next();
		
		in.close();
		
		System.out.printf("��� �������: %s", ctoa(a.charAt(0)));
	}

	public static int ctoa(char a)
	{
		return a;
	}
}