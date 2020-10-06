import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Class2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите числа:");
		String[] strArr = in.nextLine().split(" ");
		ArrayList<Integer> mas = new ArrayList<>(strArr.length);
		for (int i = 0; i < strArr.length; i++)
		{
			mas.add(Integer.parseInt(strArr[i]));
		}
		
		in.close();
		
		System.out.println(differenceMaxMin(mas));
	}
	
	public static int differenceMaxMin(ArrayList<Integer> mas)
	{
		Iterator<Integer> it = mas.iterator();
		int max = it.next();
		int min = max;
		while (it.hasNext())
		{
			int val = it.next();
			if (val > max)
			{
				max = val;
			}
			else if (val < min)
			{
				min = val;
			}
		}
		
		return max - min;
	}
}
