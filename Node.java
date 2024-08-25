public class Node {
	public String val;
	public Node next;
	
	public Node(String initVal, Node initNext) {
		val = initVal;
		next = initNext;
	}
	
	public String getVal() {
		return this.val;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setVal(String newVal) {
		this.val = newVal;
	}
	
	public void setNext(Node newNext) {
		this.next = newNext;
	}
}
