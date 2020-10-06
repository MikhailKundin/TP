import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;

import MyPackage.*;

public class Main
{

	public static void main(String[] args) {
		if (args.length != 3)
		{
			System.out.println("usage: LR3 <URL> <depth> <threads count>");
			return;
		}
		
		UrlContainer urlContainer = new UrlContainer(args[0]);
		int maxDepth = Integer.parseInt(args[1]);
		int threadCount = Integer.parseInt(args[2]);
		
		ArrayList<UrlScanner> scanners = new ArrayList<>(threadCount);
		for (int i = 0; i < threadCount; i++)
		{
			UrlScanner scanner = new UrlScanner(urlContainer, maxDepth);
			scanner.setDaemon(true);
			scanner.start();
			scanners.add(scanner);
		}
		
		boolean processing = true;
		while (processing == true)
		{
			Thread.yield();
			processing = false;
			for (UrlScanner scanner : scanners)
			{
				if (scanner.getState() != Thread.State.WAITING)
				{
					processing = true;
					break;
				}
			}
		}
		
		Hashtable<String, UrlInfo> visitedUrl = urlContainer.getVisitedUrl();
		Enumeration<UrlInfo> val = visitedUrl.elements();
		while (val.hasMoreElements())
		{
			UrlInfo urlInfo = val.nextElement();
			System.out.println(urlInfo.getUrl());
		}
		System.out.println("Всего просмотрено url: " + Integer.toString(visitedUrl.size()));
	}
}
