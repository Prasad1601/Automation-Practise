package bhaurevision1;

import java.util.Scanner;

public class Scanner2 {
	void scanner () {
		int a=2;
		int b = 1;
		while(b<=10)
		{
			int c =a*b;
			b++;
			System.out.println(c);
		}
		
	}
	void dhruv()
	{
	Scanner scr = new Scanner(System.in);
	System.out.println("please write table of 2");
	int num = scr.nextInt();
	int b = 1;
	while(b<=10)
	{
		int c =num*b;
		b++;
		System.out.println(c);
	}
	
	}
	public static void main(String[] args) {
		Scanner2 abc = new Scanner2();
		//abc.scanner();
		abc.dhruv();
}
	
}
