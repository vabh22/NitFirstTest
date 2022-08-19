package p1;
import java.util.*;

public class DemoHashmap {
	public static void main(String args[]) {
		HashMap<Integer,String> a1=new HashMap<Integer,String>();//
		a1.put(1,"one");
		a1.put(2, "Two");
		a1.put(3, "Three");
		a1.put(4, "Four");
		for(Map.Entry m:a1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
