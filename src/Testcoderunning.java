 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;					
public class Testcoderunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] i = {"Jay", "Bhagwan", "Rahul", "Shetty"};
		
		for (String j : i )
			
		{
			
			System.out.println(j);
		}
   
		
		ArrayList <String> g = new ArrayList <String>();
		
		g.add("Job");
		g.add("Done");
		g.add("Boy");
		
		
		System.out.println(g.get(0));
		
		  List <String> t  = Arrays.asList(i);
		 
		  System.out.println(t.contains("Shetty"));
		  
				
				
		}

	}


