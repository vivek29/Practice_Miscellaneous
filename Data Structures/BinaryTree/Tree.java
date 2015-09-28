package com.practice.BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Tree {
	
	private Node root;
	
	public Tree(){		// constructor
		root=null;
	}

	public Node find(int key){
		
		Node current = root;
		
		while(current.data != key){
			
			if(key<current.data)
				current = current.leftChild;
			else
				current = current.rightChild;
			
			if(current==null)			// if not find
				return null;
		}
		return current;	
	}
	
	public void insert(long data){
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(root==null)
			root = newNode;
		else {
			
			Node current = root;
			Node parent;
			
			while(true){
				
				parent = current;
				
				if(data<current.data){			// go left
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						return;
					}	
				}
				else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}	
				}	
			}			// end while
		}
	}	// end insert
	
	
	public boolean delete(int key){
		
		if(root==null)					// empty tree
			return false;
		
		Node current = root;
		Node parent = root;
		
		boolean isLeftChild = true;
		
		while(current.data != key){				// search for node
			
			parent = current;
			if(key<current.data){
				isLeftChild = true;
				current = current.leftChild;
			}
			else{
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null){
				return false;			// didn't find it
			}
		}
		
		// if no children, simply delete it
		
		if(current.leftChild==null && current.rightChild==null){
			if(current==root){			// if root
				root = null;			// tree empty
			}
			
			else if(isLeftChild)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}
		
		// if no right child, replace with left subtree
		
		else if(current.rightChild==null) {
			if(current==root){			// if root
				root = current.leftChild;			// tree empty
			}
			
			else if(isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		}
		
		// if no left child, replace with right subtree
		
		else if(current.leftChild==null) {
			if(current==root){			// if root
				root = current.rightChild;			// tree empty
			}
			
			else if(isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		}

		// else 2 children, sp replace with inorder successor
		else {
			// get successor of node to delete
			
			Node successor = getSuccessor(current);
			// connect parent of current to successor instead
			if(current==root)
				root = successor;
			else if(isLeftChild)
				parent.leftChild = successor;				
			else
				parent.rightChild = successor;
		
		// connect successor to current's left child
			successor.leftChild = current.leftChild;
		}
		
		return true;
	}
	
	
	// returns node with next-highest value after delNode
	// goes to right child, then right child’s left descendents
	
	private Node getSuccessor(Node delNode){
		
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;		// go to right child
		
		while(current != null){					// untill no more left children
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor != delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	
	public void traverse(int traverseType){
		
		switch(traverseType)
		{
		case 1: System.out.println("Preorder traversal: ");
				preOrder(root);
				break;
		case 2: System.out.println("Inorder traversal: ");
				inOrder(root);
				break;
		case 3: System.out.println("Postorder traversal: ");
				postOrder(root);
				break;
		}
		System.out.println();
	}
	
	private void preOrder(Node localRoot){
		
		if(localRoot != null){
			
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);			
		}
	}
	
	private void inOrder(Node localRoot){
		
		if(localRoot != null){
			
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rightChild);			
		}
	}
	
	int i=0;
	double[] temp = new double[32];	
	private double[] inOrderforDuplicates(Node localRoot){

		if(localRoot != null){
			
			inOrderforDuplicates(localRoot.leftChild);
			temp[i++] = localRoot.data;
			inOrderforDuplicates(localRoot.rightChild);			
		}
		return temp;
	}

	
	private void postOrder(Node localRoot){
		
		if(localRoot != null){
			
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);			
			System.out.print(localRoot.data + " ");
		}
	}
	
	private int countDuplicates(long key){
		
		int count=0;
		
		double temp[] = inOrderforDuplicates(root);
		
		for(int j=0;j<temp.length;j++){
			if(temp[j]==key)
				count++;
		}
		return count;
	}

	public void displayTree(){
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		
		while(isRowEmpty==false){
			Stack localStack = new Stack();
			isRowEmpty = true;
			
			for(int j=0; j<nBlanks;j++)
				System.out.print(" ");
			
			while(globalStack.isEmpty()==false){
				Node temp = (Node)globalStack.pop();
				
				if(temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				}
				else{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
					System.out.print(" ");
			}		// end while globalStack not empty
			
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push(localStack.pop());
		}	// end while isRowEmpty is false
		System.out.println("......................................................");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		int value;	
		Tree theTree = new Tree();
		
		theTree.insert(23);
		theTree.insert(3);
		theTree.insert(43);
		theTree.insert(34);
		theTree.insert(8);
		theTree.insert(58);
		theTree.insert(17);
		theTree.insert(54);
		theTree.insert(92);
		theTree.insert(21);
		theTree.insert(38);

		while(true){
			
			System.out.print("Enter first letter of show, insert, find, count duplicate(c), delete, or traverse: ");
			int choice = getChar();
			switch(choice){
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
			
				if(found != null) {
					System.out.print("Found: ");
					found.displayNode();
					System.out.println();
				}
				else
					System.out.print("Could not find " + value + "\n");
				break;
			case 'c':
					System.out.print("Enter value to count duplicates of: ");
					value = getInt();
					int count = theTree.countDuplicates(value);
					System.out.println("No. of duplicates for "+value+" are "+count);
					break;
			
			case 'd':
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if(didDelete)
					System.out.print("Deleted " + value + '\n');
				else
					System.out.print("Could not delete " + value + "\n");
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				value = getInt();
				theTree.traverse(value);
				break;
			default:
				System.out.print("Invalid entry\n");
			}		// end switch	
		}
			
	}
	
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException	{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	
}
