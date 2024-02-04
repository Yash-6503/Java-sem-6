import java.util.HashMap;
import java.util.TreeMap;
public class setB2
{
	public static void main(String[]args)
	{
	HashMap<String,Integer>map=new HashMap<>();
	map.put("Prasad",2002);
	map.put("Ashish",2001);
	map.put("suhas",2002);
	map.put("swayam",2001);
	map.put("sanket",2002);
	System.out.println("\n HashMap Detsils Before sorting:\n"+map);
	TreeMap<Object,Object>tm=new TreeMap<>(map);
	System.out.println("\n HashMap Details After sorting:\n"+tm);
	}
}
