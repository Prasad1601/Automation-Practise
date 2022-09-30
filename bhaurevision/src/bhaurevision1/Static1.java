package bhaurevision1;

public class Static1 {
	static int a = 10;
	static int p = 20;
	static int c = a+p;
	static void addition()
	{

		System.out.println(c);
	}

	void substwo()
	{
		int d = 20;
		int g = 10;
		int t = d-g;

		System.out.println(t);

		if(d==g)
		{
			System.out.println("both same");
		}
		else
		{
			System.out.println("both diffrerant");
		}
	}
	public static void main(String[] args) {
		addition();
		Static1 obj = new Static1();
		obj.substwo();

	}
}
