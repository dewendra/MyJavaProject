package streamAPIs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import collections.List;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer>number=new ArrayList<>();
		number.add(5);
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(25);
		System.out.println("ArrayList :"+number);
		System.out.println("Converting List to Set by using Stream APIs");
		Set<Integer> newSet=new HashSet<>();
		newSet=number.stream().collect(Collectors.toSet());
		System.out.println("HashSet"+newSet);
		
		Set<String> animals=new HashSet<>();
		animals.add("Cow");
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Horse");
		System.out.println("Set Animals List :"+animals);
		System.out.println("Converting Set to List by using Stream APIs");
		java.util.List<String> newList=new ArrayList<>();
		newList=animals.stream().collect(Collectors.toList());
		System.out.println("List animals :"+newList);

		
	}

}
