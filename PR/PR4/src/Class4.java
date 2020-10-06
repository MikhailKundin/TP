import java.util.Scanner;

public class Class4 {
	
	public static final int G_START = 9;
	public static final int G_FINISH = 17;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите 4 значения:");
		double start = in.nextDouble();
		double finish = in.nextDouble();
		double rate = in.nextDouble();
		double mult = in.nextDouble();
		
		in.close();
		
		System.out.println(overTime(start, finish, rate, mult));
	}

	public static String overTime(double start, double finish, double rate, double mult)
	{
		double reg = 0;
		double over = 0;
		
		if (start < G_START && finish < G_START)
		{
			over = finish - start;
		}
		else if (start < G_START && finish >= G_START && finish <= G_FINISH)
		{
			over = G_START - start;
			reg = finish - G_START;
		}
		else if (start < G_START && finish > G_FINISH)
		{
			over = G_START - start + finish - G_FINISH;
			reg = G_START + G_FINISH;
		}
		else if (start >= G_START && start <= G_FINISH && finish >= G_START && finish <= G_FINISH)
		{
			reg = finish - start;
		}
		else if (start >= G_START && start <= G_FINISH && finish > G_FINISH)
		{
			reg = G_FINISH - start;
			over = finish - G_FINISH;
		}
		else
		{
			over = finish - start;
		}
		
		return "$" + String.format("%.2f", reg*rate + over*rate*mult);
	}
}
