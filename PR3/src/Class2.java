import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(findZip(str));
	}

	public static int findZip(String str)
	{
		return str.indexOf("zip", str.indexOf("zip")+3);
	}
}
