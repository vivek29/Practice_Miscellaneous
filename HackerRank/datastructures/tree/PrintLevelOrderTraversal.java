package datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderTraversal {

	void LevelOrder(Node root) {

		if(root==null)
			return;
		else{
			Queue<Node> queue=new LinkedList<Node>();//make a queue
			queue.add(root); //add root

			while(!queue.isEmpty()){ //check if queue gets empty
				Node head=queue.poll();  //remove first(FIFO)
				System.out.print(head.data+" "); //print the data
				if(head.left!=null)
					queue.add(head.left); //add to queue
				if(head.right!=null)
					queue.add(head.right);   
			}   
		}
	}

	//level by level traversal of tree with all elements with SAME LEVEL on SAME line		
	/*

	Queue<TreeNode> treeNodes = new LinkedList<TreeNode>();

	int qSize = 0;		
	while(!treeNodes.isEmpty()){
		qSize = treeNodes.size();
		while(qSize > 0){
			TreeNode current = treeNodes.poll();
			System.out.print(current.elem+" ");
			if(current.leftChild != null) 
				treeNodes.add(current.leftChild);
			if(current.rightChild != null)
				treeNodes.add(current.rightChild);
			qSize--;
		}
		System.out.println("");
	}
	 */

	// show tree nodes at the desired level		
	/*		
	Queue<Integer> levels = new LinkedList<Integer>();
	treeNodes.add(node);
	levels.add(0);

 	while(!treeNodes.isEmpty()){
		TreeNode current = treeNodes.poll();
		int currentLevel = levels.poll();

		if(currentLevel == desire)
			System.out.print(current.elem+" ");

		if(current.leftChild != null) 
			treeNodes.add(current.leftChild);levels.add(currentLevel+1);
		if(current.rightChild != null)
			treeNodes.add(current.rightChild);levels.add(currentLevel+1);

	}
	 */

}
