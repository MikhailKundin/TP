import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Class6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите размер первого и второго массива:");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		ArrayList<Integer> mas1 = new ArrayList<>(n1);
		ArrayList<Integer> mas2 = new ArrayList<>(n2);
		System.out.println("Введите первый и второй массив:");
		for (int i = 0; i < n1; i++)
		{
			mas1.add(in.nextInt());
		}
		for (int i = 0; i < n2; i++)
		{
			mas2.add(in.nextInt());
		}
		
		in.close();
		
		System.out.println(same(mas1, mas2));
	}
	
	public static boolean same(ArrayList<Integer> mas1, ArrayList<Integer> mas2)
	{
		if ((new HashSet<Integer>(mas1)).size() == (new HashSet<>(mas2)).size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
