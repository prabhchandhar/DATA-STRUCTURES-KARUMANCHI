//list position always taken from 0

package doublyLists;

public class TestDoubly {

	public static void main(String[] args) {
		DLLNode dllNode = new DLLNode(10);

		DLLNode dllNode1 = new DLLNode(20);
		dllNode.setNext(dllNode1);
		dllNode1.setPrevious(dllNode);
		DLLNode dllNode2 = new DLLNode(30);
		dllNode1.setNext(dllNode2);
		dllNode2.setPrevious(dllNode1);

		DLLNode dllNode3 = new DLLNode(40);
		dllNode2.setNext(dllNode3);
		dllNode3.setPrevious(dllNode2);

		DLLNode dllNode4 = new DLLNode(50);
		dllNode3.setNext(dllNode4);
		dllNode4.setPrevious(dllNode3);

		DLLNode dllNode5 = new DLLNode(60);
		dllNode4.setNext(dllNode5);
		dllNode5.setPrevious(dllNode4);

		DLLNode dllNode6 = new DLLNode(70);
		dllNode5.setNext(dllNode6);
		dllNode6.setPrevious(dllNode5);
		dllNode6.setNext(null);

		OperationsDoublyLinkedList doublyLinkedList = new OperationsDoublyLinkedList();
		DLLNode dllNode7 = new DLLNode(80);

		DLLNode temp = doublyLinkedList.insertInList(7, dllNode, dllNode7);
		System.out.println(DLLNode.sizeOfList(temp));
		DLLNode tempNode = temp;
		for (int i = 0; i < DLLNode.sizeOfList(temp); i++) {

			System.out.println(tempNode.getData());
			tempNode = tempNode.getNext();

		}

		DLLNode temp2 = doublyLinkedList.deleteNode(temp, 5);
		tempNode = temp2;
		System.out.println(DLLNode.sizeOfList(temp2));
		for (int i = 0; i < DLLNode.sizeOfList(temp2); i++) {

			System.out.println(tempNode.getData());
			tempNode = tempNode.getNext();

		}

	}

}
