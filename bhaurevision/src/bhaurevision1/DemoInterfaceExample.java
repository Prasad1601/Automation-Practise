package bhaurevision1;

public class DemoInterfaceExample implements DemoInterface{
	
	@Override
	public void demomethod1() {
			System.out.println("I'm default method");
	}
	@Override
	public void demomethod2() {
		System.out.println("I'm public method");	
	}
	@Override
	public int demomethod3() {
		System.out.println("I'm return type method");
		return 0;
	}
	@Override
	public void demomethod4(int a) {
		System.out.println("I'm parameterized method");
	}
	public static void main(String[] args) {
		DemoInterfaceExample obj= new DemoInterfaceExample();
		obj.demomethod1();
		obj.demomethod2();
		obj.demomethod3();
		obj.demomethod4(15);
		obj.demomethod5();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
