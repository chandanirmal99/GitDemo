
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// {Section 3 = Chapter 27}/////////////////////////////////////////////////////////////
		
		//string is an object //String literal
		
//		String s = "Rahul Shetty Academy";
//		String s1 = "Rahul Shetty Academy";
//		String s5 = "hello";
//		
	//System.out.println(s1);
		
		// New Operator
		
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
	
	System.out.println(s4);
	System.out.println("********");
	
	String s = "Rahul Shetty Academy";
//	String [] splittedString = s.split(" ");
	
	String [] splittedString = s.split("Shetty");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	System.out.println(splittedString[1].trim());
	
	for (int h = 0; h<s.length(); h++)
		
	{
		System.out.println(s.charAt(h));
	}		
	
	System.out.println("********");
	
	
	
	
	for (int h = s.length()-1; h<s.length(); h--)
		
	{
		System.out.println(s.charAt(h));
	}
	
	
	}

}
