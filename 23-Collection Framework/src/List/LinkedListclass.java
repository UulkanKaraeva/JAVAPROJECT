package List;

import java.util.LinkedList;

public class LinkedListclass {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<String>();
		
		object.add("A");
		object.add("B");
		object.add("C");
		object.add("D");
		object.add(2,"E");
		object.add("F");
		object.add("G");
		
		System.out.println(object);
		
	        object.remove("B");
			object.remove(3);
		    object.remove();
		    object.remove();
		    
		    System.out.println(object);
		    
		    int size = object.size();
			System.out.println(size);
			
			System.out.println(object.get(2));
			
	}

}
