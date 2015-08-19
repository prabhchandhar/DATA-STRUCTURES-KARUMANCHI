package singleLists;

public class TestSingly {
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(10);
		ListNode listNode1 = new ListNode(20);
		listNode.setNext(listNode1);
		ListNode listNode2 = new ListNode(30);
		listNode1.setNext(listNode2);
		ListNode listNode3 = new ListNode(40);
		listNode2.setNext(listNode3);
		ListNode listNode4 = new ListNode(50);
		listNode3.setNext(listNode4);
		ListNode listNode5 = new ListNode(60);
		listNode4.setNext(listNode5);
		ListNode insertNode = new ListNode(70);
		ListNode letsSee = new OperationsSinglyLinkedList().insertInLinkedList(listNode, insertNode, 6);
		System.out.println(letsSee.ListLength(letsSee));
		while(letsSee!=null){
			System.out.println(letsSee.getData());
			letsSee = letsSee.getNext();
		}
		ListNode letsSeeAgain = new OperationsSinglyLinkedList().deleteFromList(listNode,6);
		System.out.println(letsSeeAgain.ListLength(letsSeeAgain));
		while(letsSeeAgain!=null){
			System.out.println(letsSeeAgain.getData());
			letsSeeAgain = letsSeeAgain.getNext();
		}
	}

}
