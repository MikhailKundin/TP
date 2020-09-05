import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Class3 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите размер массива:");
		int n = in.nextInt();
		
		System.out.println("Введите массив:");
		ArrayList<Integer> mas = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			mas.add(in.nextInt());
		}
		
		in.close();
		
		System.out.println(isAvgWhole(mas));
	}
	
	public static boolean isAvgWhole(ArrayList<Integer> mas)
	{
		Iterator<Integer> it = mas.iterator();
		int sum = 0;
		while (it.hasNext())
		{
			sum += it.next();
		}
		
		if (sum % mas.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
