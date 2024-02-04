import java.util.*;
class setA4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Hashtable<String,Long>ht=new Hashtable<>();
System.out.println("How many elements:");
int n=sc.nextInt();
System.out.println("Enter elements in key value pair:");
for(int i=0;i<n;i++)
{
ht.put(sc.next(),sc.nextLong());
}
System.out.println("Added elemens are:"+ht);
}
}
