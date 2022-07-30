package com.greatlearning.Tree;
public class Driver {
	public static void main(String args[])
	{
		 ConvertToRightSkewed tree=new ConvertToRightSkewed();
		 tree.root=new Node(50);
		 tree.root.left=new Node(30);
		 tree.root.right=new Node(60);
		 tree.root.left.left=new Node(10); 
		 tree.root.right.left=new Node(55);
		 tree.ConvertBSTToRightSkewed(tree.root);
		 tree.traverseRightSkewed();
	}

}
