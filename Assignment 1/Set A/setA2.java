import java.util.*;
class setA2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	LinkList<String>L1=new LinkList<>();
	System.out.println("How many friends:");
	int n=sc.nextInt();
	System.out.println("Enter friends names:");
	for(int i=0;i<n;i++)
	{
		L1.add(sc.next());
	}
	System.out.println("Added elements are:");
	System.out.println(L1);
	}
}


