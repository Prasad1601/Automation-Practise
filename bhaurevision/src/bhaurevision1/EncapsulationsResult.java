package bhaurevision1;

import java.util.Scanner;

public class EncapsulationsResult extends Encapsulation{
	
	static String id;
	static int pass;
	
	void loginmethod()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter your userid:");
		this.id = scr.next();
		System.out.println("Please enter your password:");
		this.pass= scr.nextInt();
	}
	
	public static void main(String[] args) {
		EncapsulationsResult obj = new EncapsulationsResult();
		obj.loginmethod();
		obj.setUserid(id);
		obj.setPassword(pass);
	}
	}