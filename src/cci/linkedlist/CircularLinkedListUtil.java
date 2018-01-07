package cci.linkedlist;

public class CircularLinkedListUtil {

	/*
	 * Circular Race Track problem.
	 */
	public Node junctionPoint(Node node){
		if(node == null){
			return null;
		}
		
		Node slowPointer = node;
		Node fastPointer = node;
		while(fastPointer.getNext()!=null){
			fastPointer = fastPointer.getNext().getNext();
			slowPointer = slowPointer.getNext();
		}
		
		if(fastPointer.getNext()==null){
			//no circular linked list
			return null;
		}
		
		fastPointer = node;
		while(fastPointer!=slowPointer){
			fastPointer = fastPointer.getNext();
			slowPointer = slowPointer.getNext();
		}
		
		return slowPointer;
	}
	
}
