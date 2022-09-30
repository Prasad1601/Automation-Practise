package bhaurevision1;

public interface DemoInterface {
	int a=13;
	int b=34;
	abstract void demomethod1();
	abstract public void demomethod2();
	abstract public int demomethod3();
	abstract void demomethod4(int a);
	default void demomethod5()
	{	
	}
}
