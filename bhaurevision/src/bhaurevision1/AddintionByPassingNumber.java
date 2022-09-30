package bhaurevision1;

import java.util.Scanner;

public class AddintionByPassingNumber {

	public static void main(String[] args) {
		int a[]= {1,1,1,1};
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum =0;
		for (int i=1;i<a.length;i++) {
			sum=sum+a[i]*num;
		}
		System.out.println(sum);
	}

}
