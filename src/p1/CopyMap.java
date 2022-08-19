package p1;
import java.util.*;

public class CopyMap {

	public static void main(String[] args) {
		
		System.out.println("=====first map=====");
		HashMap<Integer,String>ob1 = new HashMap<Integer,String>();
		ob1.put(1,"radha");
		ob1.put(2, "Mohan");
		ob1.put(3, "Krishna");
		ob1.put(4, "Ramkrishn");
		for(Map.Entry e:ob1.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("====Second map====");
		HashMap<Integer,String>ob2 = new HashMap<Integer,String>();
		ob2.put(5,"rohan");
		ob2.put(6, "Panna");
		ob2.put(7, "Mona");
		ob2.put(8, "Jyoti");
		for(Map.Entry e:ob1.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("===After coping====");
		ob2.putAll(ob1);
		System.out.println("After copy map:"+ob2);
		

	}

}
