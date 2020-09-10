import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Введите фигуру (пешка, конь, ладья, слон, ферзь, король), ее положение и целевую позицию. (Вы играете за белых)");
		String figure = in.next();
		String pos = in.next();
		String dest = in.next();
		
		in.close();
		
		System.out.println(canMove(figure, pos, dest));
	}

	public static boolean canMove(String figure, String pos, String dest)
	{
		switch (figure)
		{
		case "пешка":
			if (pos.charAt(0) == dest.charAt(0) && 
			   (pos.charAt(1) == dest.charAt(1)-1 || (pos.charAt(1) == '2' && pos.charAt(1) == dest.charAt(1)-2)))
			{
				return true;
			}
			else
			{
				return false;
			}
		case "конь":
			if ((Math.abs(pos.charAt(0) - dest.charAt(0)) == 2 && Math.abs(pos.charAt(1) - dest.charAt(1)) == 1) ||
				(Math.abs(pos.charAt(0) - dest.charAt(0)) == 1 && Math.abs(pos.charAt(1) - dest.charAt(1)) == 2))
			{
				return true;
			}
			else
			{
				return false;
			}
		case "ладья":
			if (pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1))
			{
				return true;
			}
			else
			{
				return false;
			}
		case "слон":
			if (Math.abs(pos.charAt(0) - pos.charAt(1)) == Math.abs(dest.charAt(0) - dest.charAt(1)))
			{
				return true;
			}
			else
			{
				return false;
			}
		case "ферзь":
			if ((pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1)) ||
				(Math.abs(pos.charAt(0) - pos.charAt(1)) == Math.abs(dest.charAt(0) - dest.charAt(1))))
			{
				return true;
			}
			else
			{
				return false;
			}
		default:
			if ((pos.charAt(0) == dest.charAt(0) && Math.abs(pos.charAt(1) - dest.charAt(1)) == 1) ||
				(pos.charAt(1) == dest.charAt(1) && Math.abs(pos.charAt(0) - dest.charAt(0)) == 1) ||
				(Math.abs(pos.charAt(0) - dest.charAt(0)) == 1 && Math.abs(pos.charAt(1) - dest.charAt(1)) == 1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
