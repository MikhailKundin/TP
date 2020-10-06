import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите две строки:");
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		in.close();
		
		System.out.println(doesRhyme(str1, str2));
	}

	public static boolean doesRhyme(String str1, String str2)
	{
		int index;
		
		index = str1.lastIndexOf(' ');
		if (index == -1)
		{
			index = 0;
		}
		String word1 = str1.substring(index+1).toUpperCase();
		
		index = str2.lastIndexOf(' ');
		if (index == -1)
		{
			index = 0;
		}
		String word2 = str2.substring(index+1).toUpperCase();
		
		String check = "";
		for (int i = 0; i < word1.length(); i++)
		{
			char ch = word1.charAt(i);
			if (ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'A' || ch == 'I')
			{
				check += ch;
			}
		}
		
		int count = 0;
		for (int i = 0; i < word2.length(); i++)
		{
			char ch = word2.charAt(i);
			if (ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'A' || ch == 'I')
			{
				if (count >= check.length())
				{
					return false;
				}
				else if (ch != check.charAt(count))
				{
					return false;
				}
				count++;
			}
		}
		
		return true;
	}
}
