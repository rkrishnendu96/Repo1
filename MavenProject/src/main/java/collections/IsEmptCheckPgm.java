package collections;

import java.util.ArrayList;

public class IsEmptCheckPgm {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>(); // string only
		obj.add("name");
		obj.add("roll num");
		obj.add("school");    
		System.out.println(obj);
		
		boolean b= obj.isEmpty();
		System.out.println(b);
		
	/*	obj.remove(2);
		System.out.println(obj);   */
		
		System.out.println(obj.size());
		

		// TODO Auto-generated method stub

	}

	}

