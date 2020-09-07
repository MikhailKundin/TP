import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите рост и вес:");
		double h = in.nextDouble();
		double w = in.nextDouble();
		
		in.close();
		
		System.out.println(BMI(h, w));
	}

	public static String BMI(double h, double w)
	{
		double val = w / (h*h);
		String res = String.format("%.1f", val);
		if (val < 18.5)
		{
			res += " Underweight";
		}
		else if (val >= 18.5 && val < 25)
		{
			res += " Normal weight";
		}
		else
		{
			res += " Overweight";
		}
		
		return res;
	}
}
