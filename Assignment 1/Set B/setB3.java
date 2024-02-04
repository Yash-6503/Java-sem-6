import java.io.*;
import java.util.*;
public class setB3
{
	public static void main(String[] args)
	{
	try{
		File f=new File("B3.txt");
		BufferedReader br=null;
		br=new BufferedReader(new FileReader(f));
		Hashtable<String,String>table=new Hashtable<>();
		Scanner sc=new Scanner(System.in);
		String line="";
		while((line=br.readLine())!=null)	
		{
		String[] parts=line.split("\t");
		String name=parts[0].trim();
		String number=parts[1].trim();
		if(!name.equals("")&& !number.equals(""))
		{
		table.put(name,number);
		}
		}
		System.out.println("Entwer name:");
		String key=sc.nextLine();
		if(table.containsKey(key))
		{
			System.out.println(table.get(key));
			br.close();
		}
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}
