package datastructures.tree;

public class InsertNodeBT {

	static Node Insert(Node root,int data) {

		Node newNode = new Node();
		newNode.data = data;

		if(root==null) {
			root = newNode;
			return root;
		}    
		else {
			Node current = root;
			Node parent;

			while(true){
				parent = current;
				if(data<current.data){			// go left
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return root;
					}	
				}
				else {
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return root;
					}	
				}	
			}			// end while
		}
	}
}
