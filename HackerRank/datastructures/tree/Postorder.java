package datastructures.tree;

public class Postorder {

	void Postorder(Node root) {

		if(root != null){

			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

}
