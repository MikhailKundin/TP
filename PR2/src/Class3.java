import java.util.Scanner;
import java.util.ArrayList;

public class Class3 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите массив:");
		String[] strArr = in.nextLine().split(" ");
		ArrayList<Integer> mas = new ArrayList<>(strArr.length);
		for (int i = 0; i < strArr.length; i++)
		{
			mas.add(Integer.parseInt(strArr[i]));
		}
		
		in.close();
		
		System.out.println(isAvgWhole(mas));
	}
	
	public static boolean isAvgWhole(ArrayList<Integer> mas)
	{
		int sum = 0;
		for (int val : mas)
		{
			sum += val;
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
