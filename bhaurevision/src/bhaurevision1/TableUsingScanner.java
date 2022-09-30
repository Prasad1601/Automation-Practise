package bhaurevision1;

import java.util.Scanner;

public class TableUsingScanner {
	
	void table()
	{
		int a = 2;
		int b = 1;
		while(b<=10)
		{
			int c = a*b;
			System.out.println(c);
			b++;
		}
	}
	
	void usingscanner()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the number here:");
		int num = scr.nextInt();
		int b = 1;
		while(b<=10)
		{
			int c = num*b;
			System.out.println(c);
			b++;
		}
	}
	
	void reverseusingscanner()
	{
		Scanner abc = new Scanner(System.in);
		
	System.out.println("Please enter the number you wish to reverse here:");
	int a = abc.nextInt();
	int check = a;
	int reverse = 0;
	while(a!=0)
	{
		int b=a%10;
		reverse = reverse*10+b;
		a=a/10;
	}
	System.out.println("the reverse number is"+reverse);
	if(check==reverse)
	{
	System.out.println("This is a palindrome number");
	}else
	{
		System.out.println("This is not a palindrome number");
		
	}
	}
	
	public static void main(String[] args) {
		TableUsingScanner obj = new TableUsingScanner();
		//obj.table();
		//obj.usingscanner();
		obj.reverseusingscanner();
	}

}
