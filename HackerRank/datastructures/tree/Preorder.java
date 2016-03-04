package datastructures.tree;

public class Preorder {

	void Preorder(Node root) {

		if(root != null){

			System.out.print(root.data + " ");
			Preorder(root.left);
			Preorder(root.right);			
		}
	}	
}
