package bhaurevision1;

import java.util.Scanner;

public class ReverseStringChiku {

	
	void stringreverse()
	{
		String a = "Prasad";
		int b = a.length();
		b = b-1;
		while(b>=0)
		{
			System.out.print(a.charAt(b));
			b--;
		}
	}
	
	void reversename()
	{
		String a = "I love Pune";
		int b = a.length();
		//b = b-1;
		int c = b-1;
		while(c>=0)
		{
			System.out.print(a.charAt(c));
			c--;
		}
	}
	
	void reverseusingscanner()
	{
	Scanner obj = new Scanner(System.in);	
	System.out.println("Please enter the text");
	String a = obj.nextLine();
	int b = a.length();
	System.out.println(b);

	b = b-1;
	while(b>=0)
	{
		System.out.print(a.charAt(b));
		b--;
	}
	}
	
	public static void main(String[] args) {
		ReverseStringChiku obj = new ReverseStringChiku();
		//obj.stringreverse();
//		obj.reversename();
		obj.reverseusingscanner();
	}
}
