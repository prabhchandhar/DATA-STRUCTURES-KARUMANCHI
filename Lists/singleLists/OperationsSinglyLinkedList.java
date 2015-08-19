package singleLists;

public class OperationsSinglyLinkedList {

	public ListNode insertInLinkedList(ListNode headerNode, ListNode nodeToInsert, int position) {

		if (headerNode == null) {
			return nodeToInsert;
		} else {
			if (position == 0) {
				nodeToInsert.setNext(headerNode);
				return nodeToInsert;
			} else if (headerNode.ListLength(headerNode) == position) {
				ListNode tempNode = headerNode;
				while (tempNode != null) {
					tempNode = tempNode.getNext();
					if (tempNode.getNext() == null) {
						tempNode.setNext(nodeToInsert);
						return headerNode;
					}

				}
			} else if (position > 0) {

				ListNode tempNode = headerNode;
				ListNode currentNode = headerNode;
				int tempPosition = 0;
				while (tempPosition < position-1) {
					tempNode = tempNode.getNext();
					tempPosition++;
				}
				currentNode = tempNode;
				tempNode = currentNode.getNext();
				currentNode.setNext(nodeToInsert);
				nodeToInsert.setNext(tempNode);
				return headerNode;

			}

		}
		return nodeToInsert;

	}
	
	public ListNode deleteFromList(ListNode headerNode, int position){
		ListNode tempNode = headerNode.getNext();
		ListNode currentNode = tempNode;
		if(position==0){
			currentNode = null;
			return tempNode;
		}
		else{
			int temp=1;
			if(position>0){
				while(temp<position-1){
					tempNode = tempNode.getNext();
					temp++;
				}
				currentNode =tempNode;
				
			}
			if(temp==position-1){
				if(position==headerNode.ListLength(headerNode))
				{
					currentNode.setNext(null);
				}
				else{
				tempNode = currentNode.getNext();
				currentNode.setNext(tempNode.getNext());
				tempNode = null;
			}
			}
		
		}
		return headerNode;

	}

}
