package com.ds.tree;

public class TreeUtil {

	/* 
	 * Additional implementation of the augmented tree.
	 * Fantastic Algorithm!!
	 */
	public Node insert(Node<Integer> node, Node newNode){
		if(node == null) node = newNode;
		else{
			if(node.getData().compareTo((Integer) newNode.getData())<0){
				node.setRight(insert(node.getRight(), newNode));
			} else{
				node.setLeft(insert(node.getLeft(), newNode));
			}
		}
		if((height(node.getRight()) - height(node.getLeft())) == 1){
			node = leftRotate(node);
		}
		if((height(node.getLeft())-height(node.getRight())) > 1){
			node = rightRotate(node);
		}
		setRankOfNode(node);
		return node;
	}
	
	public Node search(Node node, Integer data){
		if(node.getData().compareTo(data) == 0){
			return node;
		}
		if(node.getData().compareTo(data)>0){
			return search(node.getRight(), data);
		} else{
			return search(node.getLeft(), data);
		}
	}
	
	public int height(Node node){
		if(node == null){
			return 0;
		}
		return max(1 + height(node.getLeft()), 1 + height(node.getRight()));
	}
	
	private int max(int a, int b){
		return (a>b==true?a:b);
	}
	
	public Node leftRotate(Node node){
		Node rightChild = node.getRight();
		node.setRight(rightChild.getLeft());
		rightChild.setLeft(node);
		setRankOfNode(node);
		return rightChild;
	}
	
	public Node rightRotate(Node node){
		Node leftChild = node.getLeft();
		node.setLeft(leftChild.getRight());
		leftChild.setRight(node);
		setRankOfNode(node);
		return leftChild;
	}
	
	private void setRankOfNode(Node node){
		node.setRank( 1 +
				((node.getLeft()==null)?0:node.getLeft().getRank()) +
				((node.getRight()==null)?0:node.getRight().getRank()));
	}
}
