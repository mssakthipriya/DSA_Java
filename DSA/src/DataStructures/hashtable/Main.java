package DataStructures.hashtable;

import java.util.HashMap;

public class Main {
	
	public static boolean itemInCommon(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Boolean> myHashMap = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i<arr1.length;i++) {
			myHashMap.put(i, true);
		}
		
		for(int j = 0 ; j <arr2.length;j++ ) {
			if(myHashMap.get(j)!=null) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		HashTable myHT = new HashTable();
		
		myHT.set("nails", 100);
		myHT.set("tile", 50);
		myHT.set("lumber", 80);
		myHT.set("bolts", 200);
		myHT.set("screws", 140);
		
		myHT.printTable();
		
		System.out.println(myHT.get("lumber"));
		System.out.println(myHT.get("Jumber"));
		
		System.out.println(myHT.keys());
		

	}

}
