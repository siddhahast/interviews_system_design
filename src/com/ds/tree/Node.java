package com.ds.tree;

public class Node<D extends Comparable<D>> {

	private D data;
	private Node left;
	private Node right;
	private int rank;
	
	public Node(D data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.rank = 1;
	}
	
	public D getData() {
		return data;
	}
	public void setData(D data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
