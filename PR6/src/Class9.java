import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите выражение:");
		String str = in.nextLine();
		
		in.close();
		
		System.out.println(formula(str));
	}

	public static boolean formula(String str)
	{
		str = str.replaceAll(" ", "");
		
		String[] parts = str.split("=");
		int part = getPart(parts[0]);
		for (int i = 1; i < parts.length; i++)
		{
			if (getPart(parts[i]) != part)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static int getPart(String part)
	{
		if (part.charAt(0) == '-')
		{
			part = "0" + part;
		}
		
		char operation = '?';
		int index = 0;
		int res = 0;
		for (int i = 0; i < part.length(); i++)
		{
			char ch = part.charAt(i);
			if (ch != '+' && ch != '-')
			{
				continue;
			}
			
			switch (operation)
			{
			case '+':
				res += getMultDiv(part.substring(index, i));
				break;
			case '-':
				res -= getMultDiv(part.substring(index, i));
				break;
			default:
				res = getMultDiv(part.substring(index, i));
			}
			operation = ch;
			index = i+1;
		}
		
		switch (operation)
		{
		case '+':
			if (index != part.length()-1)
			{
				res += getMultDiv(part.substring(index, part.length()));
			}
			else
			{
				res += Integer.parseInt(Character.toString(part.charAt(index)));
			}
			break;
		case '-':
			if (index != part.length()-1)
			{
				res -= getMultDiv(part.substring(index, part.length()));
			}
			else
			{
				res -= Integer.parseInt(Character.toString(part.charAt(index)));
			}
			break;
		default:
			res = getMultDiv(part.substring(index, part.length()));
		}
		
		return res;
	}
	
	public static int getMultDiv(String part)
	{
		char operation = '?';
		int res = 1;
		int index = 0;
		for (int i = 0; i < part.length(); i++)
		{
			char ch = part.charAt(i);
			if (ch != '*' && ch != '/')
			{
				continue;
			}
			
			switch (operation)
			{
			case '*':
				res *= Integer.parseInt(part.substring(index, i));
				break;
			case '/':
				res /= Integer.parseInt(part.substring(index, i));
				break;
			default:
				res = Integer.parseInt(part.substring(index, i));
			}
			operation = ch;
			index = i+1;
		}
		
		switch (operation)
		{
		case '*':
			if (index != part.length()-1)
			{
				res *= Integer.parseInt(part.substring(index, part.length()));
			}
			else
			{
				res *= Integer.parseInt(Character.toString(part.charAt(index)));
			}
			break;
		case '/':
			if (index != part.length()-1)
			{
				res /= Integer.parseInt(part.substring(index, part.length()));
			}
			else
			{
				res /= Integer.parseInt(Character.toString(part.charAt(index)));
			}
			break;
		default:
			res = Integer.parseInt(part.substring(index, part.length()));
		}
		
		return res;
	}
}
