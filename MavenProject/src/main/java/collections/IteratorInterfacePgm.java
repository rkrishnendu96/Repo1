package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfacePgm {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>(); // string only
		obj.add("name");
		obj.add("roll num");
		obj.add("school");
		Iterator<String> it = obj.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);

	}

}
