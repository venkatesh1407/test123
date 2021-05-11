package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		String fileName = "C:Users/venky/Documents/lines.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            //br returns as stream and convert it into a List
            list = br.lines().map(x -> x.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            list.sort(Comparator.naturalOrder());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        list.forEach(System.out::println);

	}

}
