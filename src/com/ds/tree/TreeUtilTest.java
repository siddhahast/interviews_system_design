package com.ds.tree;

public class TreeUtilTest {

	public static void main(String[] args) {
		
		Node tree1 = null;
		Node node = new Node(35);
		
		TreeUtil util = new TreeUtil();
		tree1 = util.insert(tree1, node);
		tree1= util.insert(tree1, new Node(37));
		tree1 = util.insert(tree1, new Node(33));
		tree1 = util.insert(tree1, new Node(53));
		tree1 = util.insert(tree1, new Node(44));
		tree1 = util.insert(tree1, new Node(34));
		tree1 = util.insert(tree1, new Node(31));
		
		System.out.println("Rank of the root of the tree : - "+ tree1.getRank());
		System.out.println("Data in the root's right child : - "+ tree1.getRight().getData());
		System.out.println("Rank of the root's right child : - "+tree1.getRight().getRank());
		System.out.println("Height of the tree is : - "+ util.height(tree1));
			
	}
}
