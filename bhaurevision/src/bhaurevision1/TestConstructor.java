package bhaurevision1;

public class TestConstructor {
	int a=20;
	TestConstructor() {
		int b=30;
		System.out.println(b);
	}
	TestConstructor(String w){
		System.out.println(w);
	}
	
	public static void main(String[] args) {
		TestConstructor obj = new TestConstructor();
		TestConstructor obj1= new TestConstructor("mangesh");
		//System.out.println(obj.a);

	}

}
