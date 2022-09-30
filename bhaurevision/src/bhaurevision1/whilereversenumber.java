package bhaurevision1;

public class whilereversenumber {
	
	void reverse()
	{
		int a = 12378;
		int reverse = 0;
		while(a!=0)//met
		{
			int b = a%10;//5,4,3,2
			reverse =  reverse*10 + b; //5, 50+4=54,   540+3=543, 5430+2=54321
			a = a/10;//1234,123,12

		}
	
		System.out.println(reverse);
	}
	
	void reversestring()
	{
		String input = "Prasad";
		int a = input.length();
		while(a!=0)
		{
			System.out.print(input.charAt(a-1));
			a--;
		}
	}
	
	
	
	public static void main(String[] args) {
		whilereversenumber obj = new whilereversenumber();
		obj.reverse();
		obj.reversestring();
	}
}
