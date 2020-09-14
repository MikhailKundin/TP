import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Class6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите два массива:");
		String[] strArr = in.nextLine().split(" ");
		
		ArrayList<Integer> mas1 = new ArrayList<>(strArr.length);
		for (int i = 0; i < strArr.length; i++)
		{
			mas1.add(Integer.parseInt(strArr[i]));
		}
		
		strArr = in.nextLine().split(" ");
		
		ArrayList<Integer> mas2 = new ArrayList<>(strArr.length);
		for (int i = 0; i < strArr.length; i++)
		{
			mas2.add(Integer.parseInt(strArr[i]));
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
