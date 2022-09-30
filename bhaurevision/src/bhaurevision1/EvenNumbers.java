package bhaurevision1;

public class EvenNumbers {

	void even()
	{
		for(int i = 0;i<=10;i++)
		{
			int a=i%2;
			if(a == 0)
			{
				System.out.print("Even numbers are"+i);
			}else
			{
				System.out.println("odd numbers are"+i);
			}

		}
	}
	public static void main(String[] args) {
		EvenNumbers obj = new EvenNumbers ();
		obj.even();
	}
}
