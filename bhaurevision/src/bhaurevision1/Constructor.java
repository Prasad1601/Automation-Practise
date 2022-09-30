package bhaurevision1;

public class Constructor {
	
	Constructor()
	{
		int a=52;
		System.out.println(a);
	}
	Constructor (int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	Constructor(String a)
	{
		int b = a.length();
		int c = b-1;
		while (c>=0)
		{
			System.out.print(a.charAt(c));
			c--;
		}
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10, 20);
		Constructor obj2 = new Constructor("prasad");
		
	}

}
