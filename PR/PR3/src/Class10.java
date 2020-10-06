import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Class10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите стороны треугольника:");
		ArrayList<Integer> mas = new ArrayList<>(3);
		mas.add(in.nextInt());
		mas.add(in.nextInt());
		mas.add(in.nextInt());
		
		in.close();
		
		System.out.println(rightTriangle(mas));
	}

	public static boolean rightTriangle(ArrayList<Integer> mas)
	{
		Collections.sort(mas);
		int a = mas.get(0);
		int b = mas.get(1);
		int c = mas.get(2);
		
		if (a*a + b*b == c*c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
