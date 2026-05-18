import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaSteam115 {

	// Count the number of names starting with alphabet A in list
	// @Test
	// {Section 15 - Chapter 115
	// Part1}////////////////////////////////////////////////////////////////

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Man");
		names.add("Don");
		names.add("women");
		names.add("Joy");
		names.add("Boy");

		int count = 0;

		for (int i = 0; i < names.size(); i++)

		{
			String actual = names.get(i);
			if (actual.startsWith("A"))

			{
				System.out.println(actual.toUpperCase());
				count++;

			}

		}

		System.out.println(count);
//
//		// {Section 15 - Chapter 115 Part2}/////////////
//
//		Long c = names.stream().filter(s -> s.startsWith("A")).count();
//
//		System.out.println(c);
//
//		// {Section 15 - Chapter 115 Part3}/////////////
//
//		Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
//			s.startsWith("A");
//			return false;
//
//		}).count();
//
//		System.out.println(d);
//
//		Long e = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.startsWith("A")).count();
//
//		System.out.println(e);
//
//		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
//
//		// {Section 15 - Chapter 115 Part4}/////////////
//
//		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
//
//		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//				.forEach(s -> System.out.println(s));

		// {Section 15 - Chapter 115 Part5}/////////////

//       Use of sort

		List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");

		// names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
		// 		.forEach(s -> System.out.println(s));

//        Merging two Array List

		Stream <String>newStream = Stream.concat(names.stream(), names1.stream());

		// newStream.sorted().forEach(s -> System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equals("Adam"));
		
		System.out.println(flag);
		
		Assert.assertTrue(flag);}
	
		
// {Section 15 - Chapter 115 Part6}/////////////
		
		
	//@Test
		
		public void streapass(){
		
		List<String> ls = Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		List<Integer>lg = values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(lg);
		System.out.println(lg.get(3));
		
		

	}

}
