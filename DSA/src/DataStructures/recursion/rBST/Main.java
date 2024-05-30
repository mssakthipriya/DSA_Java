package DataStructures.recursion.rBST;

public class Main {

	public static void main(String[] args) {
		rSearchTree myRBST = new rSearchTree();
		myRBST.rInsert(47);
		myRBST.rInsert(21);
		myRBST.rInsert(76);
		myRBST.rInsert(18);
		myRBST.rInsert(27);
		myRBST.rInsert(52);
		myRBST.rInsert(82);
		
		System.out.println(myRBST.BFS());


	}
}
