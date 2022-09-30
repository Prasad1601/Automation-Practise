package bhaurevision1;

public class CopyArrayElementsToAnother {

	
	static void array()
	{
		int a[]= {9,8,7,6,5,4,3,2,1};
		int b[]=new int[a.length];
		for(int i = 0; i<a.length;i++) {
		b[i]=a[i];
		}
		for(int j:b)
		{
			System.out.print(j);
		}
		
		}
	
	public static void main(String[] args) {
		array();
	}
}
