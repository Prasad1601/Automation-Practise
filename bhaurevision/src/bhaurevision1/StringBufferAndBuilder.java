package bhaurevision1;
import java.lang.StringBuffer;
public class StringBufferAndBuilder {
	String c = "Bhaushya";
	void NormalString()
	{
		String A = "Mangesh ";
		String B = "Lokhande";
		System.out.println(A.concat(B));
		String d = c;
	}
	
	void stringBuffer()
	{
		 StringBuffer str = new StringBuffer("Mangesh ");
		 //str="Bhaushya";
		 str.append("Lokhande");
		 System.out.println(str);
		 str.reverse();
		 System.out.println(str);		 
	}
	
	void stringBuilder()
	{
		StringBuilder str = new StringBuilder("Bhausaheb ");
		str.append("Pawar");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StringBufferAndBuilder obj = new StringBufferAndBuilder();
		obj.NormalString();
		obj.stringBuffer();
		obj.stringBuilder();
	}

}
