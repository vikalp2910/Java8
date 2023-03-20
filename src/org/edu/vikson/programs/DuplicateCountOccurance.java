package org.edu.vikson.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCountOccurance {

	public static void main(String[] args) {
		
		String sentence="welcome to java8 and java is programming language welcome";
		List<String> list=Arrays.asList(sentence.split(" "));
		
		Map<String, Long> mapCount=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mapCount);
		
		String data="vikalpvikalpsonkar";
		List<Character> characterList=new ArrayList<>();
		
		for(char ch : data.toCharArray()) {
			
			characterList.add(ch);
		}
		System.out.println(characterList);
		Map<Character, Long> mapCount2=characterList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mapCount2);
	}
}
