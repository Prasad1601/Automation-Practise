package bhaurevision1;

public class Reverse {
	
		void match()
	 		{
				int x = 89547; // nt be zero
				int reapet = 0;
				int same = x;
				while(x !=0)
	 				{
						int b = x%10;
						reapet = reapet*10+b; //repeted action + mod
						x=x/10;
					}
				if(same==reapet) // comparison with output and memory store integer
				{
					System.out.println(" match");
				}
				else
				{
					System.out.println("missmatched");
				}
			}
		public static void main(String[] args) {
			Reverse xyz = new Reverse();
			xyz.match();
			}
	}



