
public class Methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// {Section 3 - CHapter 28}////////////////////////////////////////////////////////////////
		
		
		Methodsdemo d = new Methodsdemo ();
		
		//System.out.println(d.getData());
		
		String A = d.getData();
		
		MethodDemo2 b = new MethodDemo2 ();
		
		b.getuserdata();
		
		System.out.println(A);
		getuserdata2();
		System.out.println(getuserdata2());
	}



public String getData()
{
	
	System.out.println("hello world");
	return "rahul shetty";
}

public static String getuserdata2()

{
	
	System.out.println("hello world");
	return "rahul shetty";
}



}