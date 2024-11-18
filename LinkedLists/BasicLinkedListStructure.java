package linkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	Node head;
	Node tail;
	
	public LinkedList(){
		//For starters we are creating Empty Linked List structure So both head and tail will point to null only
		this.head = null; 
		this.tail = null;
	}
}


public class BasicLinkedListStructure {

}
