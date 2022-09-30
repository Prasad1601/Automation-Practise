package bhaurevision1;

public class ExceptionHandling {
	
	void exception()
	{
		try 
		{
		int a = 10/0;
		System.out.println(a);
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Mangesh");
		}
		}
	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.exception();
	}

}
