import java.io.*;
class mythread extends Thread
{
	String msg;
	int n;
	mythread(String msg,int n)
	{
		this.msg=msg;
		this.n=n;
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(msg+"::"+i+" times");
		}
	}
}
class setA1
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		mythread m1=new mythread("Thread 1:COVID19",n);
		mythread m2=new mythread("Thread 2:LOCKDOWN2020",n+10);
		mythread m3=new mythread("Thread 3:VACCINATED2021",n+20);
		m1.start();
		m2.start();
		m3.start();
	}
}
