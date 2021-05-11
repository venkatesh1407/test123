package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 2. Given an integer List "L" and an integer B, return the indices of any two element from list that sums up to B
Eg - L = {3,5,6,2,0} and B = 7 .. output will be 1 & 3 .. since 5+2 = 7 and index for 5 is 1 and index for 2 is 3
 */
public class Scenario2 {

	public static void main(String[] args) {
		int[] nums = { 3, 5, 6, 2, 0 };
		System.out.println("using Arrays: " + Arrays.toString(usingForLoop(nums, 7)));
		System.out.println("using map: " + Arrays.toString(usingHashMap(nums, 7)));
		System.out.println("using List: " + sumOfIndiciesUsingCollec(Arrays.asList(3, 5, 6, 2, 0), 7));
		System.out.println("using Streams: " + sumOfIndiciesUsingStreams(Arrays.asList(3, 5, 6, 2, 0), 7));

	}

	private static int[] usingHashMap(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}
		return new int[] {};
	}

	private static int[] usingForLoop(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
// L = {3,5,6,2,0} and B = 7 .. output will be 1 & 3
	private static List<Integer> sumOfIndiciesUsingCollec(List<Integer> sum, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < sum.size(); i++) {
			int temp = target - sum.get(i);
			if (map.containsKey(temp)) {
				List<Integer> list1 = new ArrayList<>();
				list1.add(map.get(temp));
				list1.add(i);
				return list1;
			} else {
				map.put(sum.get(i), i);
			}

		}
		List<Integer> list2 = new ArrayList<>();

		return list2;
	}

	private static List<Integer> sumOfIndiciesUsingStreams(List<Integer> sum, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		sum.stream().filter(y -> {
			int temp = target - y;
			if (map.containsKey(temp)) {
				list1.add(map.get(temp));
				list1.add(y + 1);
				return list1 != null;
			} else {
				map.put(y, sum.indexOf(y));
			}
			return false;
		}).collect(Collectors.toList());

		return list1;
	}
}
