package DataStructures.recursion.rBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class rSearchTree {
	Node root;
	
	class Node{
		Node right;
		Node left;
		int value;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private Node rInsert(Node current, int value) {
		if(current == null) return new Node(value);
		if(value < current.value) {
			current.left = rInsert(current.left, value);
		}else if(value > current.value){
			current.right = rInsert(current.right, value);
		}
		
		return current;
	}
	
	public void rInsert(int value) {
		if(root == null) root = new Node(value);
		rInsert(root, value);
	}
	
	private boolean rContains(Node current, int value) {
		if(current == null) return false;
		if(current.value == value) return true;
		if(value < current.value) {
			return rContains(current.left,value);
		}else {
			return rContains(current.right, value);
		}
		
	}
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	public int minVal( Node current) {
		while(current.left != null) {
			current = current.left;
		}
		return current.value;
	}
	
	
	private Node rDelete(Node current, int value) {
		if(current == null) return null;
		
		if(current.value < value) {
			current.left = rDelete(current.left, value);
		}else if(current.value > value) {
			current.right = rDelete(current.right, value);
		}else {
			if((current.left == null)&&(current.right == null)) {
				return null;
			}else if(current.left==null) {
				current = current.right;
			}else if(current.right == null) {
				current = current.left;
			}else {
				int subMinVal = minVal(current.right);
				current.value = subMinVal;
				rDelete(value);
				current.right = rDelete(current.right, subMinVal);
			}
		}
		return current;
	}
	
	public void rDelete(int value) {
		rDelete(root, value);
	}
	
	public ArrayList<Integer> BFS(){
		Node current =root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		queue.add(current);
		while(queue.size()!=0) {
			current = queue.remove();
			result.add(current.value);
			if(current.left!=null) {
				queue.add(current.left);
			}
			if (current.right!=null) {
				queue.add(current.right);
			}
		}

		
		return result;
	}

}
