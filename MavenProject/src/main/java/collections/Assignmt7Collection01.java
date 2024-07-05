package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignmt7Collection01 
{

	public static void main(String[] args) 
	{
		ArrayList<String> obj = new <String>ArrayList();
		obj.add("red");
		obj.add("blue");
		obj.add("white");
		obj.add("green");
		System.out.println(obj);
		System.out.println(obj.get(2));
		obj.remove(2);
		System.out.println(obj);

		Iterator<String> it = obj.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
