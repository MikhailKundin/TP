import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите заголовок:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(getHashTags(str));
	}

	public static String getHashTags(String str)
	{
		String[] words = str.split(" |\\W ");
		ArrayList<String> res = new ArrayList<>(3);
		res.add("");
		res.add("");
		res.add("");
		
		for (String word : words)
		{
			if (!res.contains(word))
			{
				if (word.length() > res.get(2).length())
				{
					if (word.length() > res.get(1).length())
					{
						if (word.length() > res.get(0).length())
						{
							res.set(2, res.get(1));
							res.set(1, res.get(0));
							res.set(0, word);
						}
						else
						{
							res.set(2, res.get(1));
							res.set(1, word);
						}
					}
					else
					{
						res.set(2, word);
					}
				}
			}
		}
		
		String result = "";
		Iterator<String> it = res.iterator();
		while (it.hasNext())
		{
			String val = it.next();
			if (!val.equals(""))
			{
				result += "#"+val.toLowerCase()+" ";
			}
		}
		
		return result;
	}
}
