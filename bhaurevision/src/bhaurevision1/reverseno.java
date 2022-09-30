package bhaurevision1;

public class reverseno {
	void palindro()
	{
		int a = 12456;
		int reverse = 0;
		int same = a;
		while(a !=0)
		{
			int b = a%10;
			reverse = reverse*10+b;
			a=a/10;
		}
		if(same==reverse) 
		{
			System.out.println("this is palendro");
		}
		else
		{
			System.out.println("this is not palendro");
		}
	}
	public static void main(String[] args) {
		reverseno xyz = new reverseno();
		xyz.palindro();
	}
	

}
