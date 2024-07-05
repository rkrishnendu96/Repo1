package collections;

import java.util.ArrayList;

public class Assignmt7Collection01SearchElement {

	public static void main(String[] args) {
		ArrayList<String> obj = new <String> ArrayList();
		obj.add("red");
		obj.add("blue");
		obj.add("white");
		obj.add("green");
		System.out.println(obj);
		
		String searchElement="white";
		for(int i=0; i<obj.size();i++) // i is the index value
		{		
			if(searchElement==obj.get(i))
		    {
				//System.out.println();

				System.out.println("element"+" "+searchElement+" "+" is found");
				break;
			}
			
			}}}
		