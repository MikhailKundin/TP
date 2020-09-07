import java.util.Scanner;
import java.util.HashSet;

public class Class10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите последовательность символов и символ, обозначающий начало/конец книги:");
		String str = in.next();
		String endChar = in.next();
		
		in.close();
		
		System.out.println(countUniqueBooks(str, endChar));
	}

	public static int countUniqueBooks(String str, String endChar)
	{
		int count = 0;
		boolean open = false;
		HashSet<Character> set = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (!open && ch == endChar.charAt(0))
			{
				open = true;
			}
			else if (open)
			{
				if (ch != endChar.charAt(0))
				{
					if (!set.contains(ch))
					{
						set.add(ch);
						count++;
					}
				}
				else
				{
					open = false;
					set.clear();
				}
			}
		}
		
		return count;
	}
}
