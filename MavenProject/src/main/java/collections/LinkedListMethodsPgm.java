package collections;

import java.util.LinkedList;

public class LinkedListMethodsPgm {

	public static void main(String[] args) {
			LinkedList<String> obj = new LinkedList<String>(); // string only
			obj.add("name");
			obj.add("roll num");
			obj.add("school");
			obj.add("violet");
			System.out.println(obj);
			System.out.println(obj.get(2));
			boolean b= obj.isEmpty();
			System.out.println(b);
			obj.remove("school");
			System.out.println(obj);
			System.out.println(obj.size());
			obj.removeAll(obj);
			System.out.println(obj);
		// TODO Auto-generated method stub

	}

}
