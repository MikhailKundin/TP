import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите строку:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(translateSentence(str));
	}

	public static String translateSentence(String str)
	{
		String[] sent = str.split(" ");
		String res = "";
		for (String word : sent)
		{
			res += translateWord(word) + " ";
		}
		
		return res;
	}
	
	public static String translateWord(String word)
	{
		boolean cap;
		char ch = word.charAt(0);
		if (ch >= 'A' && ch <= 'Z')
		{
			cap = true;
		}
		else
		{
			cap = false;
		}
		word = word.toLowerCase();
		
		String buff = "";
		String res = "";
		
		int index = word.length();
		for (int i = 0; i < index; i++)
		{
			ch = word.charAt(i);
			if (ch < 'a' || ch > 'z')
			{
				index = i;
			}
		}
		if (index != word.length())
		{
			buff = word.substring(index);
		}
		
		ch = word.charAt(0);
		if (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a')
		{		
			if (cap)
			{
				res += (char)(word.charAt(0)-32);
			}
			else
			{
				res += word.charAt(0);
			}
			
			if (index != 1)
			{
				res += word.substring(1, index);
			}
			res += "yay" + buff;
		}
		else
		{
			String clearWord = word.substring(0, index);
			String str = Character.toString(clearWord.charAt(0));
			for (int i = 1; i < clearWord.length(); i++)
			{
				ch = clearWord.charAt(i);
				if (ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'a')
				{
					index = i;
					break;
				}
				else
				{
					str += ch;
				}
			}
			
			if (cap)
			{
				res += (char)(clearWord.charAt(index)-32);
			}
			else
			{
				res += clearWord.charAt(index);
			}
			
			if (index != clearWord.length()-1)
			{
				res += clearWord.substring(index+1);
			}
			res += str + "ay" + buff;
		}
		
		return res;
	}
}
