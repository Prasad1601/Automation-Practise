package bhaurevision1;

public interface NewInterface {

	public void methodname();
	int a = 10;
	
}

class mangesh implements NewInterface{

	@Override
	public void methodname() {
		// TODO Auto-generated method stub
		System.out.println("This is from interface");
	}
	
	public static void main(String[] args) {
		mangesh obj = new mangesh();
		obj.methodname();
		System.out.println(obj.a);
	}
	
}