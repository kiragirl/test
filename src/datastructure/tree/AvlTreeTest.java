package datastructure.tree;

public class AvlTreeTest {
	public static void main(String args[]){
		AvlTree<Integer> avlTree = new AvlTree<Integer>();
		for(int i =0; i<10; i++){
			avlTree.insert(i);
		}
		System.out.println(avlTree);
		avlTree.remove(3);
		System.out.println(avlTree);
/*		for(int i =9; i>5; i--){
			avlTree.remove(i);
		}*/
		System.out.println();
	}
}
