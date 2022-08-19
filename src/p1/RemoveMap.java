package p1;
import java.util.*;

public class RemoveMap {

	public static void main(String[] args) {
		System.out.println("===Mapping show");
		HashMap<Integer,String> ob1=new HashMap<Integer,String>();
		ob1.put(1, "Apple");
		ob1.put(2, "Pears");
		ob1.put(3, "Banana");
		for(Map.Entry m:ob1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		ob1.clear();
		System.out.println("After remove all of the mapping"+ob1);
		
	}

}
