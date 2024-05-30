package DataStructures.hashtable;

import java.util.ArrayList;

public class HashTable {
	
	private int size = 7;
	private Node[] dataMap;
	
	public class Node{
		private String key;
		private int value;
		private Node next;
		public Node(String key, int value){
			this.key = key;
			this.value = value;
		}
	}
	
	private int Hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for(int i = 0; i < keyChars.length; i++) {
			int asciiVal = keyChars[i];
			//multiplying with a prime number like 23 results in getting a value which is more random
			hash = (hash + asciiVal*23) % dataMap.length;
			
		}
		
		return hash;
	}
	
	public HashTable(){
		dataMap = new Node[size]; 
	}
	
	public void set(String key, int value) {
		int index = Hash(key);
		Node newNode = new Node(key,value);
		if(dataMap[index]== null) { 
			dataMap[index] = newNode;
		}else {
			Node temp = dataMap[index];
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
					
		}
		
	}
	
	public int get(String key) {
		int index = Hash(key);
		Node temp = dataMap[index];
		while(temp!=null) {
			if(temp.key == key) return temp.value;
			temp = temp.next;
		}
		return 0;
	}
	
	public ArrayList keys() {
		ArrayList<String> allkeys = new ArrayList<String>();
		for(int i = 0; i < dataMap.length;i++) {
			Node temp = dataMap[i];
			while(temp!=null) {
				allkeys.add(temp.key);
				temp = temp.next;
			}
		}
		
		
		return allkeys;
	}
	
	public void printTable() {
		for(int i=0;i<dataMap.length;i++) {
			System.out.println(i+": ");
			Node temp = dataMap[i];
			while(temp!=null) {
				System.out.println("{"+temp.key+"="+temp.value+"}");
				temp = temp.next;
			}
		}
	}

}
