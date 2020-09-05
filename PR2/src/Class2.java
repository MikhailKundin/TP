import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Class2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество чисел:");
		int n = in.nextInt();
		
		System.out.println("Введите числа:");
		ArrayList<Integer> mas = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			mas.add(in.nextInt());
		}
		
		in.close();
		
		System.out.printf("Разница между самым большим и самым маленьким числом: %d", differenceMaxMin(mas));
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
