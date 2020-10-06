import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите двоичное число:");
		String str = in.next();
		
		in.close();
		
		System.out.println(longestZero(str));
	}

	public static String longestZero(String str)
	{
		String[] strArr = str.split("1");
		
		String res = "";
		for (String val : strArr)
		{
			if (val.length() > res.length())
			{
				res = val;
			}
		}
		
		return res;
	}
}
