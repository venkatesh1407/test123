package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given an integer List "L" and an integer variable "A", while going through "L" when u encounter "A" in the list , move that element to end of the list. Eg: L = {4,1,2,1,3} A= 1 .... o/p - {4,2,3,1,1}
public class Scenario1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 2, 1, 4, 3, 1);//o/p [5, 2, 4, 3, 1, 1, 1]
		list = new ArrayList<Integer>(list);

		System.out.println("Using normal ForLoop: "+usingForLoop(list));
		System.out.println("Using Collection Sort: "+usingCollectionSort(list));
		System.out.println("Using Streams Sort: "+usingStreamSort(list));
	}
	private static List<Integer> usingForLoop(List<Integer> list1){
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == 1) {
				list1.remove(list1.get(i));
				list1.add(1);
			}

		}
		return list1;
		
	}
	private static List<Integer> usingCollectionSort(List<Integer> list1){
		Comparator<Integer> c1 = Comparator.comparing( e -> e ==1);
		Collections.sort(list1,c1);
		return list1;
	}
	private static List<Integer> usingStreamSort(List<Integer> list1){
		List<Integer> l1 = list1.stream().sorted(Comparator.comparing(x -> x ==1)).collect(Collectors.toList()) ;
		return l1;
	}

}
