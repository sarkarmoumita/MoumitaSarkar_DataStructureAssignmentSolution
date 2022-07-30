/* 
 Since we need to display the nodes in ascending order which is possible
 only by the inorder traversal of the tree.
 We traverse the left subtree, the root and then the right subtree
 Once we have reached the root, we keep track of the previous node
 and adjust the right pointer to obtain the desired rightskewed tree
 */
package com.greatlearning.Tree;

public class ConvertToRightSkewed {
	Node root;
	Node headnode=null;
	Node prevnode=null;
	public void ConvertBSTToRightSkewed(Node root)
	{
		if(root==null)
			return;
		ConvertBSTToRightSkewed(root.left);// traverse the left subtree
		/*-- the following operations once the root(desired node) is reached--*/
		if(headnode==null)// creating the root of the desired rightskewed tree
		{
			headnode=root;
			prevnode=root;//keeps track of the previous pointer
		}
		else
		{
			prevnode.right=root;// set the desired node to the right of the previous node
			root.left=null;//since right skewed tree is desired
			prevnode=root;//reset the previous node to the last node of the tree in making 
		}
		ConvertBSTToRightSkewed(root.right);//now traverse the right subtree
	}
	public void traverseRightSkewed()
	{
		while(headnode!=null)
		{
			System.out.print(headnode.key+"  ");
			headnode=headnode.right;
		}
	}}


