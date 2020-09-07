import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Class1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество слов и размер строки:");
		int n = in.nextInt();
		int k = in.nextInt();
		
		ArrayList<String> strArr = new ArrayList<>(n);
		System.out.println("Введите текст:");
		for (int i = 0; i < n; i++)
		{
			strArr.add(in.next());
		}
		
		in.close();
		
		System.out.println(essay(k, strArr));
	}

	public static String essay(int k, ArrayList<String> strArr)
	{
		String res = "";
		int count = k;
		Iterator<String> it = strArr.iterator();
		
		String val = it.next();
		res += val + " ";
		count -= val.length();
		while (it.hasNext())
		{
			val = it.next();
			if (count < val.length())
			{
				res += '\n';
				count = k;
			}
			res += val + " ";
			count -= val.length();
		}
		
		return res;
	}
}
