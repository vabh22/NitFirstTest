package p1;
import java.util.*;

public class SizeMap {
	public static void main(String args[])
	{
		HashMap<Integer,String> ob=new HashMap<Integer, String>();
		ob.put(1, "Sindhu");
		ob.put(2, "Rahul");
		ob.put(3, "Kamlesh");
		ob.put(4, "Jina");
		ob.put(5, "Rahul");
		System.out.println("Size of mapping in a map:"+ob.size());
	}
}
