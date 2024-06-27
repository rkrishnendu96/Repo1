package collections;

import java.util.ArrayList;
import java.util.List;

public class ListPgm {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		{
			obj.add("red");
			obj.add("green");
			obj.add("blue");
			obj.add("green");
		}

		// obj.set(1, "blue"); // replace value
		// System.out.println(obj);

		// duplicate //
		/*
		 * int firstoccurance = obj.indexOf("green");
		 * System.out.println(firstoccurance); 
		 * int lastoccurance =obj.lastIndexOf("green"); System.out.println(lastoccurance);
		 */

		// remove //
		/*
		 * obj.remove(3); System.out.println(obj); obj.remove("red");
		 * System.out.println(obj);
		 */

		// get //
		/*
		 * String a= obj.get(2); System.out.println(a);
		 */

		// contains //
		/*
		 * boolean b= obj.contains("blue"); System.out.println(b);
		 */

		// add two list //

		List<String> obje = new ArrayList<String>();
		{
			obje.add("java");
			obje.add("python");

		}

		obj.addAll(obje);
		System.out.println(obj);

	}

}
