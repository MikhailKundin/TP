package MyThreads;

public class Square extends Thread
{
	public void printRes(int n)
	{
		System.out.println("Second:\t" + Integer.toString((int)Math.pow(n, 2)));
	}
}
