import java.util.LinkedList;
import java.util.Scanner;
public class setC2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Object>L1=new LinkedList<>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		System.out.println("\n Elements in LIst:\n"+L1);
		L1.addFirst(0);
		System.out.println("\n List after adding Elements at first :\n"+L1);
		L1.removeLast();
		System.out.println("\n List after deleting last element:\n"+	L1);
		System.out.println("\n size of the List:\n"+L1.size());
		sc.close();
	}
}
