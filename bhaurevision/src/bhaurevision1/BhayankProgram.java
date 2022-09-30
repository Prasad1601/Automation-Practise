package bhaurevision1;

import java.util.Scanner;

public class BhayankProgram {
	
	void reversestring()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String a = sc.next();
		for(int i = (a.length()-1);i>=0;i--)
		{
			System.out.print(a.charAt(i));
			
		}
	}
	
	void reversenumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int b = 0;
		for(;a!=0;a=a/10)
		{
			int c = a%10;
			b = b*10+c;
		}
		System.out.println(b);
	}
	
public static void main(String[] args) {
	BhayankProgram obj = new BhayankProgram();
	//obj.reversestring();
	obj.reversenumber();
}
}
