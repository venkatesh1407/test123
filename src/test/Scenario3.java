package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*3. Given 2 list of integer L and I .. combine and sort these two into one list

Eg-L={2,4,6},I={1,3,5},o/p-{1,2,3,4,5,6}*/

public class Scenario3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 1);
		List<Integer> list2 = Arrays.asList(1, 3, 5);
		System.out.println("Result using collections : " + combinedSortedListUsingCollec(list, list2));
		System.out.println("Result using streams : " + combinedSortedListUsingStrea(list, list2));
	}

	// Approach 1
	private static Set<Integer> combinedSortedListUsingCollec(List<Integer> list, List<Integer> list2) {
		List<Integer> result = new ArrayList<>();

		result.addAll(list);
		result.addAll(list2);
		Collections.sort(result);
		Set<Integer> finalResult = new HashSet<>(result);
		return finalResult;

	}

	// Approach 2
	private static List<Integer> combinedSortedListUsingStrea(List<Integer> l, List<Integer> i) {
		List<Integer> combinedList = Stream.of(l, i).flatMap(x -> x.stream()).sorted().distinct()
				.collect(Collectors.toList());
		return combinedList;

	}
}
