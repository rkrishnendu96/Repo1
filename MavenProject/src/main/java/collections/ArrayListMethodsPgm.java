package collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListMethodsPgm {

	public static void main(String[] args) {
			ArrayList<String> obj = new ArrayList<String>(); // string only
			obj.add("name");
			obj.add("roll num");
			obj.add("school");
			System.out.println(obj);
			System.out.println(obj.get(2));
			obj.removeAll(obj);

			// TODO Auto-generated method stub

		}

	}


