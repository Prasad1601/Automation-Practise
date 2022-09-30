package bhaurevision1;

import java.util.Scanner;

public class SwitchStatment {
	
	public static void main(String[] args) {
	
		/*System.out.println("Enter any number from 1-3: ");
		Scanner obj = new Scanner(System.in);
		int fruit = obj.nextInt();*/
		
		int fruit = 0;
		
		switch(fruit)
		{
		case 1 : fruit = 1;
		System.out.println("Apple");
		break;
		
		case 2 : fruit = 2;
		System.out.println("Mango");
		break;
		
		case 3 : fruit = 3;
		System.out.println("Grape");
		break;
		
		default:
		System.out.println("No fruit");
		
		}
		
	}
	

}
