import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class Class4 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество элементов массива:");
		int n = in.nextInt();
		
		ArrayList<Integer> mas = new ArrayList<>();
		System.out.println("Введите массив чисел:");
		for (int i = 0; i < n; i++)
		{
			mas.add(in.nextInt());
		}
		
		in.close();
		
		cumulativeSum(mas);
		System.out.print("Результат: ");
		for (Integer val : mas)
		{
			System.out.print(val.toString() + " ");
		}
	}
	
	public static void cumulativeSum (ArrayList<Integer> mas)
	{
		int sum = 0;
		ListIterator<Integer> it = mas.listIterator();
		while (it.hasNext())
		{
			sum += it.next();
			it.set(sum);
		}
	}
}
