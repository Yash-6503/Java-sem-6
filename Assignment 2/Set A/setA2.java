import java.io.*;
import java.util.*;
import java.lang.String;
class mythread extends Thread
{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			try
			{
				System.out.println("KTHM College");
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error:"+e);
			}
		}
	}
}
class setA2
{
	public static void main(String args[])throws IOException
	{
		mythread m=new mythread();
		System.out.println("Before changing name of thread:"+m.getName()+"\n");
		m.setName("Computer Science");
		System.out.println("After changing name of thread:"+m.getName()+"\n");
		m.start();
	}
}
