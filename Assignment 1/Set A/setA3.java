import java.util.*;
class setA3
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	TreeSet<String>tr=new TreeSet<>();
	System.out.println("how many colors:");
	int n=sc.nextInt();
	System.out.println("Enter colors names:");
	for(int i=0;i<n;i++)
	{
	tr.add(sc.next());
	}
	System.out.println("Addes elements are:");
	System.out.println(tr);
	}
}
