import java.util.Scanner;
import java.util.ArrayList;

public class Class9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите числа:");
		String[] strArr = in.nextLine().split(" ");
		
		ArrayList<Integer> mas = new ArrayList<>(strArr.length);
		for (int i = 0; i < strArr.length; i++)
		{
			mas.add(Integer.parseInt(strArr[i]));
		}
		
		in.close();
		
		System.out.println(sumOfCubes(mas));
	}
	
	public static int sumOfCubes(ArrayList<Integer> mas)
	{
		int sum = 0;
		for (int val : mas)
		{
			sum += val * val * val;
		}
		return sum;
	}
}
