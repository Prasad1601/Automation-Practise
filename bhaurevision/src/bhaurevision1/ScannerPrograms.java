package bhaurevision1;

import java.util.Scanner;

public class ScannerPrograms {
	
	void newscanner()
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Please enter your username ");
		String username = xyz.next();
		System.out.println("Please enter your password");
		int password =	xyz.nextInt();
		System.out.println("username is"+username);
		System.out.println("password is"+password);
	}
	void table() {
		Scanner poi = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = poi.nextInt();
		
		int b = 1;
		while(b<=10) 
		{
			int c=num*b;
			System.out.println(c);
			b++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerPrograms abc = new ScannerPrograms();
		//abc.newscanner();
		abc.table();
		
		

	}

}
