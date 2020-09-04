import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Class9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ���������� �����:");
		int n = in.nextInt();
		ArrayList<Integer> mas = new ArrayList<>(n);
		
		System.out.println("������� �����:");
		for (int i = 0; i < n; i++)
		{
			mas.add(in.nextInt());
		}
		
		in.close();
		
		System.out.printf("����� �����: %d", sumOfCubes(mas));
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
