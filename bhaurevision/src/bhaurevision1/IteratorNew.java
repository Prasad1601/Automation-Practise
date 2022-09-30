package bhaurevision1;

import java.util.*;

public class IteratorNew {
	
	void method()
	{
		List<String> list = new ArrayList();
		
	list.add("Prasad");
	list.add("Mahesh");
	list.add("Mangesh");
	list.add("Shrikant");
	
	/*Iterator j = list.iterator();
	
	while(j.hasNext())
	{
		System.out.println(j.next());
	}*/
	
	ListIterator i = list.listIterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	
	System.out.println("\n\n");
	
	while(i.hasPrevious())
	{
		System.out.println(i.previous()+ " ");
	}
	}
	
	public static void main(String[] args) {
		IteratorNew obj = new IteratorNew();
		obj.method();
	}

}
