package singleLists;

public class ListNode {
	
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
		
	}
	
	public int ListLength(ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode!=null){
			length = length+1;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	
	
	

}
