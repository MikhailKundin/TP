import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Class9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите количество чисел:");
		int n = in.nextInt();
		ArrayList<Integer> mas = new ArrayList<>(n);
		
		System.out.println("¬ведите числа:");
		for (int i = 0; i < n; i++)
		{
			mas.add(in.nextInt());
		}
		
		in.close();
		
		System.out.printf("—умма кубов: %d", sumOfCubes(mas));
	}
	
	public static int sumOfCubes(ArrayList<Integer> mas)
	{
		int sum = 0;
		Iterator<Integer> it = mas.iterator();
		while (it.hasNext())
		{
			int val = it.next();
			sum += val * val * val;
		}
		return sum;
	}
}
