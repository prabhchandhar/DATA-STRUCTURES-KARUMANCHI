package doublyLists;

public class DLLNode {
	
	private int data;
	private DLLNode previous;
	private DLLNode next;
	
	public DLLNode(int data){
		this.data= data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	

}
