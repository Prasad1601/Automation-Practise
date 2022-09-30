package bhaurevision1;

import java.security.DomainCombiner;

public class Table2 {

	void table () 
	{
		int b = 5;
		for (int a=1;a<=20;a++)	 
		{
			System.out.println(a*b);
		}
	}
	void reversetable()
	{
		int d=2;
		for(int e=10;e>=0;e--) 
		{
			System.out.println(e*d);
		}
	}
	void even() 
	{
		for (int a =1; a<=10;a++)

		{
			int b = a%2;
			//System.out.println(a);
			if (b==1)
			{
				System.out.println(a);
			}
		}
	}
	void reverse()
	{
		
		int reverse = 0;
		int a =12345;
		int similar = a;
		for (;a !=0;a=a/10)
		{
			int b = a%10;
			reverse= reverse*10+b;
			//a=a/10;
		}
		System.out.println(reverse);
		if (reverse==similar)
		{
			System.out.println("it is palindrome");
		}else
		{
			System.out.println("it is not palindrome");
		}
	}
	
	void vowelscheck()
	{
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		char abc = 'g';
		if(abc ==a)
		{
			System.out.println("this is a vowel");
		}else if(abc == e)
		{
			System.out.println("this is a vowel");
		}else if(abc == i)
		{
			System.out.println("this is a vowel");
		}else if(abc == o)
		{
			System.out.println("this is a vowel");
		}else if(abc == u)
		{
			System.out.println("this is a vowel");
		}else
		{
			System.out.println("this is not a vowel");
		}
	}
	
	void newvowelcheck()
	{
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		char abc = 'e';
		if(abc == a || abc == e || abc == i || abc == o || abc == u)
		{
			System.out.println("this is a vowel");

		}else
		{
			System.out.println("this is not a vowel");

		}
	}
	
	
	
	
	public static void main(String[] args) {
		Table2 abc = new Table2();
		//abc.table();
		//abc.reversetable();
		//abc.even();
		//abc.reverse();
		//abc.vowelscheck();
		abc.newvowelcheck();

	}
}
