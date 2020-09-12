import java.util.Scanner;
import java.util.ArrayList;

public class Class7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(longestNonrepeatSubstring(str));
	}

	public static String longestNonrepeatSubstring(String str)
	{
		ArrayList<String> list = new ArrayList<>();
		String subStr = "";
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (!subStr.contains(Character.toString(ch)))
			{
				subStr += ch;
			}
			else
			{
				list.add(subStr);
				int index = subStr.indexOf(ch);
				if (index == subStr.length()-1)
				{
					subStr = "";
				}
				else
				{
					subStr = subStr.substring(index+1);
				}
				subStr += ch;
			}
		}
		list.add(subStr);
		
		String res = "";
		for (String val : list)
		{
			if (val.length() > res.length())
			{
				res = val;
			}
		}
		
		return res;
	}
}
