package cci.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListUtil {

	/*
	 * Without Iteration, using a set to track the duplicate valued nodes
	 */
	public void removeDuplicateNodesWithoutIteration(Node head) {
		if(head==null) return;
		Node curr = head.getNext();
		Node prev = head;
		Set<Integer> visitedNodes = new HashSet<Integer>();
		visitedNodes.add(prev.getData());
		while(curr!=null){
			if(visitedNodes.contains(curr.getData())){
				prev.setNext(curr.getNext());
			} else{
				visitedNodes.add(curr.getData());
			}
			curr = curr.getNext();
		}
	}

	/*
	 * Iteration approach using a runner node and current node
	 */
	private void removeDuplicateNodesWithIteration(Node head) {

		if (head == null)
			return;
		Node runner = head;
		Node prev = head;
		Node curr = head.getNext();
		while (runner != null) {
			while (curr != null) {
				if (curr.getData() == runner.getData()) {
					prev.setNext(curr.getNext());
				} else {
					prev = curr;
				}
				curr = curr.getNext();
			}
			runner = runner.getNext();
		}
	}
	
	/* 
	 * return the node that starts from nth index
	 */
	public Node nthNodeToLast(Node head, int n){
		if(head == null){
			System.out.println("Empty linked list");
			return head;
		}
		Node curr = head;
		int index = 0;
		while(curr!=null && index<n){
			curr = curr.getNext();
			index ++;
		}
		if(curr == null){
			head = curr;
		}
		if(index == n-1){
			head = curr;
		}
		return head;
	}
	
	/*
	 * Nth till last using recurssion
	 */
	public Node nthNodeToLastRec(Node node, int n, int depth){
		if(node == null){
			return node;
		}
		if(depth == n){
			return node;
		}
		return nthNodeToLastRec(node.getNext(), n, depth+1);
	}
	
}
