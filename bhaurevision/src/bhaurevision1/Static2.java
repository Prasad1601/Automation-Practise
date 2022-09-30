package bhaurevision1;

public class Static2 {
	static String s = "prasad";
	String m = "mangesh";
	void method()
	{
		if (s==m)
		{
			System.out.println("same");
		}else
		{
			System.out.println("diffrent");
		}
		if (s.equals(m))
		{
			System.out.println("same");
		}else
		{
			System.out.println("diffrent");
		}


	}
	public static void main(String[] args) {
		Static2 obj = new Static2 ();
		obj.method();

	}
}
