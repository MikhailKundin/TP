package MyPackage;

import java.util.Hashtable;

public class UrlContainer
{
	private Hashtable<String, UrlInfo> rawUrl = new Hashtable<>();
	private Hashtable<String, UrlInfo> visitedUrl = new Hashtable<>();
	
	public UrlContainer(String firstUrl)
	{
		UrlInfo urlInfo = new UrlInfo(firstUrl, 0);
		String key = urlInfo.getDomain()+urlInfo.getPath()+urlInfo.getParams();
		rawUrl.put(key, urlInfo);
	}
	
	public synchronized UrlInfo getRawUrl()
	{
		System.out.println(rawUrl.size());
		while (rawUrl.size() == 0)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
		}
		
		String key = rawUrl.keys().nextElement();
		UrlInfo urlInfo = rawUrl.get(key);
		rawUrl.remove(key);
		
		return urlInfo;
	}
	
	public synchronized void setRawUrl(UrlInfo urlInfo)
	{
		String key = urlInfo.getDomain()+urlInfo.getPath()+urlInfo.getParams();
		if (!visitedUrl.containsKey(key) && !rawUrl.containsKey(key))
		{
			rawUrl.put(key, urlInfo);
		}
		notify();
	}
	
	public Hashtable<String, UrlInfo> getVisitedUrl()
	{
		return visitedUrl;
	}
	
	public synchronized void setVisitedUrl(UrlInfo urlInfo)
	{
		String key = urlInfo.getDomain()+urlInfo.getPath()+urlInfo.getParams();
		if (!visitedUrl.containsKey(key))
		{
			visitedUrl.put(key, urlInfo);
		}
	}
}
