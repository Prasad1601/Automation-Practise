package bhaurevision1;

public class Pratiksha {
	
	void multilevelpratiksha()
	{
		System.out.println("This is first class with first method");
	}
	
	void multilevelshilpa()
	{
		System.out.println("This is first class with second method");
	}
	
	public static void main(String[] args) {
		Pratiksha obj = new Pratiksha();
		//ClassName ObjVar = new ClassName();
		//ClassName ObjVar = new Constructor(); This is why we don't need to call the constructor
		
		obj.multilevelpratiksha();
	}
}
