import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Class3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.next();
		
		in.close();
		
		System.out.println(validColor(str));
	}

	public static boolean validColor(String str)
	{
		String pattern = "rgb\\(\\d+,\\d+,\\d+\\)";
		Pattern pat = Pattern.compile(pattern);
		Matcher mat = pat.matcher(str);
		if (!mat.find())
		{
			pattern = "rgba\\(\\d+,\\d+,\\d+,(1|(0(\\.\\d+)?))\\)";
			pat = Pattern.compile(pattern);
			mat = pat.matcher(str);
			if (!mat.find())
			{
				return false;
			}
		}
		
		pattern = "\\d+";
		pat = Pattern.compile(pattern);
		mat = pat.matcher(str);
		for (int i = 0; i < 3; i++)
		{
			mat.find();
			int val = Integer.parseInt(mat.group(0));
			if (val < 0 || val > 255)
			{
				return false;
			}
		}
		
		return true;
	}
}
