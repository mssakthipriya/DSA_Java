package DataStructures.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetandHashset {
	
	public static void main(String[] args) {
		//fastest: HashSet>> LinkedHashSet >>> TreeSet
		Set<String> names = new HashSet<>();
		//Set<String> names = new TreeSet<String>();//for the natural ordering (alphabetic, numbering etc)
		//Set<String> names = new LinkedHashSet<String>();// maintains the insertion order
		names.add("Sakthi");
		names.add("Ghanu");
		names.add("Nandu");
		names.add("ghanu");
		names.add("Ghanu");
		
		//names.remove("ghanu");
		
		System.out.println(names);
		System.out.println(names.contains("ghanu"));
		System.out.println(names.isEmpty());
		//names.clear();
		//System.out.println(names.isEmpty());
		
		for(String name : names) {
			System.out.println(name);
		}
		
		names.forEach(System.out::println);
		
		Iterator<String> namesItr = names.iterator();		
		while(namesItr.hasNext()) {
			System.out.println(namesItr.next());
		}
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(2);
		numList.add(1);
		
		System.out.println(numList);
		
		//Set<Integer> numSet = new HashSet<Integer>();
		//numSet.addAll(numList);
		
		Set<Integer> numSet = new HashSet<Integer>(numList);
		System.out.println(numSet);
		
	}

}
