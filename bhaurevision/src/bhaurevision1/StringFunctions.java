package bhaurevision1;

import java.util.Scanner;

public class StringFunctions {
	
	void string()
	{
		String a = "Hello Mangesh ";
		String b = "Lokhande";
		String c = a.concat(b);
		System.out.println(a.charAt(9));
		
	}
	
	void scanner()
	{
		Scanner abc = new Scanner(System.in);
		
		System.out.println("Please enter your name here:");
		
		String name = abc.next();
		System.out.println("Your name is:"+name);
		
		System.out.println("Please enter your a here:");

		int age = abc.nextInt();
		System.out.println("Your age is"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunctions obj = new StringFunctions();
		//obj.string();
		obj.scanner();
		
	}

}
