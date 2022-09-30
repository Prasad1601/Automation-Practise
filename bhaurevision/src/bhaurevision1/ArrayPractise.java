package bhaurevision1;

public class ArrayPractise {
	
	void newarray()
	{
		/*int i[]= {1,2,3};
		
		//1...i.
		//2
		//3...
		//4...
		
		for(int j:i)
		{
			System.out.println(j);
		}*/
		
		int j[][] = new int [2][2];
		
		j[0][0]=0;
		j[0][1]=1;
		j[1][0]=2;
		j[1][1]=3;
		//j[2][0]=4; or j[1][2]=4;
		
		for(int p = 0; p<j.length; p++)//rows
		{
			
		//p0,p1
			for(int q = 0; q<j[p].length; q++)//columns//q-0,1,2
			{
				System.out.println(j[p][q]);//0,0,0,1
			}
		}
		
	}

	public static void main(String[] args) {
		ArrayPractise obj = new ArrayPractise();
		obj.newarray();
	}
	
}
