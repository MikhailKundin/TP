package MyPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlScanner extends Thread
{
	private final static String PATTERN = "href=\"http://.+?\"";
	
	private static UrlContainer urlContainer;
	private static int m_maxDepth = 1;
	
	public UrlScanner(UrlContainer container, int maxDepth)
	{
		urlContainer = container;
		m_maxDepth = maxDepth;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			UrlInfo urlInfo = urlContainer.getRawUrl();
			scanUrl(urlInfo);
			urlContainer.setVisitedUrl(urlInfo);
		}
	}
	
	public static void scanUrl(UrlInfo url)
	{
		try
		{
			String ipStr = InetAddress.getByName(url.getDomain()).toString();
			ipStr = ipStr.split("/")[1];
			Socket socket = new Socket(ipStr, 80);
			socket.setSoTimeout(3000);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("GET " + url.getPath() + " HTTP/1.1");
			pw.println("Host: " + url.getDomain());
			pw.println("");
			pw.flush();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String buff = br.readLine();
			if (buff.contains("200"))
			{
				for (buff = br.readLine(); buff != null && !buff.equals("</html>"); buff = br.readLine())
				{
					Pattern pattern = Pattern.compile(PATTERN);
					Matcher matcher = pattern.matcher(buff);
					while (matcher.find())
					{
						String htmlUrl = buff.substring(matcher.start(), matcher.end());
						int depth = url.getDepth();
						UrlInfo urlInfo = new UrlInfo(htmlUrl.substring(6, htmlUrl.length()-1), depth+1);
						if (depth+1 <= m_maxDepth)
						{
							urlContainer.setRawUrl(urlInfo);
						}
					}
				}
			}
			socket.close();
		}
		catch (Exception ex)
		{
			
		}
	}
}
