package bhaurevision1;

public class revindia {
	void india()
	{
		String i = "india is my contry";
		int b = i.length();
		b=b-1;
		while(b>=0)
		{
			System.out.print(i.charAt(b));
			b--;
		}
System.out.println("dfgfdgdfg");
	}

	int dhruv()
	{
		int a = 23;
		int b = 5;
		int c = a+b;
		int d = a-b;
		return d;
	}
	
	void india(int a, String b, char c)
	{

		System.out.println(a+" "+b+" "+c);
	}
	
	void india(String b,int a, int c)
	{
		System.out.println(b+" "+a+c);
	}
	
	int india(int a,int b)
	{
		int c = a+b;
		return c;
		
	}
	
	String india(String a, String b)
	{	
		String c;
		if(a==b){
			return c="same";
		}
		else {
			return c="DIfferent";
		}
		//return c;
		
		
	}
	

	public static void main(String[] args) {
		revindia obj = new revindia();
		//obj.india();
		//System.out.println(obj.dhruv());
		obj.india(1, "xyz", 'b');
		obj.india("abc", 2, 6);
		System.out.println(obj.india(2, 5));
		System.out.println(obj.india("Prasad", "Prasa"));
	}
	
}
