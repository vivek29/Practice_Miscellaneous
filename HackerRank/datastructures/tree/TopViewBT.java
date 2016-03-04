package datastructures.tree;

public class TopViewBT {

	void top_view(Node root) {
		if (root == null) {
			return;
		}

		if (root != null) {
			left_view(root);
			right_view(root.right);
		}
	}

	void left_view(Node root) {
		if (root != null){
			left_view(root.left);
			System.out.print(root.data + " ");
		}
	}

	void right_view(Node root) {
		if (root != null){
			System.out.print(root.data + " ");
			right_view(root.right);
		}
	}
}
