package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		String str = "hi hello";

		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print( ch[i]);
		}
		
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i]+" ");
		}
		System.out.println("===="+sb.toString());
		List<Integer> list = Arrays.asList(2, 4, 6, 1);
		List<Integer> list2 = Arrays.asList(1, 3, 5);
		List<Integer>l1 = Stream.of(list , list2).flatMap( s1 -> s1.stream()).sorted().distinct().collect(Collectors.toList());
	System.out.println(l1);
	
	}
	

}
