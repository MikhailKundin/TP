package MyThreads;

public class Cube extends Thread
{
	public void printRes(int n)
	{
		System.out.println("Third:\t" + Integer.toString(((int)Math.pow(n, 3))));
	}
}
