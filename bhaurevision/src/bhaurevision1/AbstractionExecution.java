package bhaurevision1;

public class AbstractionExecution extends DemoAbstractClass{
	@Override
	void demomethod1() {
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
	void demomethod4(int a) {
		System.out.println("I'm parameterized method");
	}
	
	public static void main(String[] args) {
		AbstractionExecution obj = new AbstractionExecution();
		obj.demomethod1();
	}

}
