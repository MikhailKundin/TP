import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Class4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите url:");
		String str = in.nextLine();
		
		in.close();
		
		String[] strs = str.split(" ", 2);
		if (strs.length == 1)
		{
			System.out.println(stripUrlParams(str));
		}
		else
		{
			System.out.println(stripUrlParams(strs[0], strs[1].split(" ")));
		}
	}

	public static String stripUrlParams(String str)
	{
		return stripUrlParams(str, new String[] {""});
	}
	
	public static String stripUrlParams(String str, String[] block)
	{
		HashSet<String> blockKeys = new HashSet<>(block.length);
		for (String val : block)
		{
			blockKeys.add(val);
		}
		
		String[] urlParts = str.split("\\?", 2);
		if (urlParts.length > 1)
		{
			String[] params = urlParts[1].split("&");
			HashMap<String, String> map = new HashMap<>();
			for (String param : params)
			{
				String[] paramParts = param.split("=", 2);
				map.put(paramParts[0], paramParts[1]);
			}
			
			String res = urlParts[0] + "?";
			
			Set<String> keys = map.keySet();
			for (String key : keys)
			{
				if (!blockKeys.contains(key))
				{
					res += key + "=" + map.get(key) + "&";
				}
			}
			
			return res.substring(0, res.length()-1);
		}
		else
		{
			return str;
		}
	}
}
