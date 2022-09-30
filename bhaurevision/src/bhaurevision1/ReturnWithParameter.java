package bhaurevision1;

public class ReturnWithParameter {
	
	String name()
	{
		String a = "love";
		return a;
	}
	void name(String a)
	{
		
		System.out.println(a);
	}
	int name( int a,int b)
	{
		int d = a+b;
		return d;
		
	}
	String name(String b,String a)
	{
		
		if(a==b)
		{
		return "same";
		}
		else
		{
			return "Diffrent";
		}
	}
	public static void main(String[] args) {
		ReturnWithParameter obj = new ReturnWithParameter();
		System.out.println(obj.name());
		obj.name("tara");
		System.out.println(obj.name(4, 6));
		System.out.println(obj.name("sandip", "sandip"));
		
		
		
	}
	
	
}
