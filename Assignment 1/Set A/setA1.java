import java.util.*;
class setA1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String>L1=new ArrayList<>();
		System.out.println("How many element:");
		int n=sc.nextInt();
		System.out.println("Enter city names:");
		for(int i=0;i<n;i++)
		{
			L1.add(sc.next());
		}
		System.out.println("Added elements are:");
		System.out.println(L1);
		Iterator<String>itr=L1.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			itr.remove();
		}
		System.out.println(L1);
	}
}
