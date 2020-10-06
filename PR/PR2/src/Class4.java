import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class Class4 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Введите массив чисел:");
		String[] strArr = in.nextLine().split(" ");
		
		ArrayList<Integer> mas = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++)
		{
			mas.add(Integer.parseInt(strArr[i]));
		}
		
		in.close();
		
		cumulativeSum(mas);
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
