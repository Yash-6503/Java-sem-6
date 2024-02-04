import java.util.TreeSet;
import java.util.Scanner;
public class setB1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
TreeSet<Object>ts=new TreeSet<>();
System.out.println("Enter how many numbers:");
int n=sc.nextInt();
System.out.println("Enter the "+n+" Numbers:");
for(int i=0;i<n;i++)
{
int num=sc.nextInt();
ts.add(num);
}
System.out.println("Numbers in sorted order and without duplication:"+ts);
sc.close();
}
}
