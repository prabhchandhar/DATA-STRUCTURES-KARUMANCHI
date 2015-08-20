package doublyLists;

public class OperationsDoublyLinkedList {

	public DLLNode insertInList(int position, DLLNode headerNode, DLLNode nodeToInsert) {
		int size = DLLNode.sizeOfList(headerNode);

		if (position == 0) {
			nodeToInsert.setNext(headerNode);
			headerNode.setPrevious(nodeToInsert);
			// headerNode.setPrevious(nodeToInsert);
			return nodeToInsert;
		}

		else if (position < 0 || position > size)
			return null;
		else {
			if (position > 0 && position < size) {
				DLLNode tempNode = null;
				int count = 0;
				tempNode = headerNode;
				while (count < position) {

					tempNode = tempNode.getNext();
					count++;
				}
				DLLNode previousNode = tempNode.getPrevious();
				tempNode = previousNode.getNext();
				previousNode.setNext(nodeToInsert);
				nodeToInsert.setPrevious(previousNode);
				nodeToInsert.setNext(tempNode);
				return headerNode;
			}
			if (position == size) {
				DLLNode tempNode = null;
				int count = 0;
				tempNode = headerNode;
				while (count < position - 1) {

					tempNode = tempNode.getNext();
					count++;
				}
				tempNode.setNext(nodeToInsert);
				nodeToInsert.setPrevious(tempNode);
				return headerNode;
			}

		}
		return headerNode;
	}

	public DLLNode deleteNode(DLLNode headerNode, int position) {
		int size = DLLNode.sizeOfList(headerNode);
		if (position == 0) {
			DLLNode currentNode = headerNode.getNext();

			return currentNode;
		}
		DLLNode currentNode = headerNode;
		DLLNode previousNode = headerNode;
	
			int count = 0;
			while (count < position-1) {
				previousNode = previousNode.getNext();
				count++;
			}

			currentNode = previousNode.getNext();
			DLLNode tempNode = currentNode.getNext();
			previousNode.setNext(tempNode);
			if (tempNode != null) {
				tempNode.setPrevious(previousNode);
			}
			currentNode = null;
		
		return headerNode;
	}
}
