package cci.linkedlist;

public class LinkedListUtilTest {

	public static void main(String[] args) {
		
		Node first = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node forth = new Node(20);
		Node fifth = new Node(25);
		Node sixth = new Node(30);
		Node seventh = new Node(35);
		Node eighth = new Node(40);
		
		first.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);
		fifth.setNext(sixth);
		sixth.setNext(seventh);
		seventh.setNext(eighth);
		
		LinkedListUtil util = new LinkedListUtil();
		Node node = util.nthNodeToLastRec(first, 2, 0);
		
		System.out.println(node==null?null:node.getData());
		
	}
}
