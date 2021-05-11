package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		//System.out.println("using List: " + sumOfIndiciesUsingCollec(Arrays.asList(3, 5, 6, 2, 0), 7));
		//System.out.println("using Streams: " + sumOfIndiciesUsingStreams(Arrays.asList(3, 5, 6, 2, 0, 2, 3)));
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
		
		
		Map<String, Long> map = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map);
	}

	private static List<Integer> sumOfIndiciesUsingStreams(List<Integer> sum) {
List<Integer> list1 = new ArrayList<>();
//sum.stream().distinct().collect(Collectors.toList());
return sum.stream().distinct().collect(Collectors.toList());
		//return sum.stream().collect(Collectors.toSet());
	}
	private static List<Integer> sumOfIndiciesUsingCollec(List<Integer> sum, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < sum.size(); i++) {
			int temp = target - sum.get(i);
			System.out.println("temp: "+temp);
			System.out.println("map: "+map);
			if (map.containsKey(temp)) {
				List<Integer> list1 = new ArrayList<>();
				list1.add(map.get(temp));
				list1.add(i);
				System.out.println("list1: "+list1);
				return list1;
			} else {
				map.put(sum.get(i), i);
			}

		}
		List<Integer> list2 = new ArrayList<>();

		return list2;
	}

}
