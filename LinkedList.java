public class LinkedList {
	public Node head;
	public int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void addToHead(Node newNode) {
		newNode.setNext(this.head);
		this.head = newNode;
		size++;
	}
	
	public Node removeFromHead() {
		if(this.size == 0) {
			System.out.println("The list is empty");
			return null;
		}
		Node firstNodePlaceholder = this.head;
		Node secondNodePlaceholder = this.head.next;
		this.head = secondNodePlaceholder;
		firstNodePlaceholder.next = null;
		this.size--;
		return firstNodePlaceholder;
	}
	
	public void addToTail(Node newNode) {
		if(this.size == 0) {
			
		} else {
			Node node = this.head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = newNode;
			this.size++;
		}
	}
	
	public Node removeFromTail() {
		if(this.size == 0) {
			System.out.println("The list is empty");
			return null;
		} else {
			Node node = this.head;
			for(int i = 0; i<this.size-2; i++) {
				node = node.getNext();
			}
			Node placeholder = node.next;
			node.next = null;
			this.size--;
			return placeholder;
		}
	}
	
//	public Node removeSpecific(String value) {
////		boolean end = false;
////		Node placeholder1 = this.head;
////		Node placeholder2 = placeholder1.getNext();
////		
////		Node removed = null;
////		
////		//head case
////		if(this.head.val.equals(value)) {
////			Node head = this.head;
////			this.head = head.next;
////			head.next = null;
////			removed = head;
////		} else {
////			while(!end) {
////				if(placeholder1.next.val.equals(value)) {
////					placeholder1.next = placeholder2.next;
////					placeholder2.next = null;
////					removed = placeholder2;
////				} else {
////					placeholder1 = placeholder2;
////					placeholder2 = placeholder2.next;
////				}
////			}
////		}
////		return removed;
//		Node node = this.head;
//		int counter = 1;
//		while(node.val != value || counter<this.size) {
//			node = node.next;
//		}
//		if()
//		
//	}
	
	public void printList() {
		if(this.size == 0) {
			System.out.println("The list is empty");
		} else {
			int counter = 0;
			Node current = this.head;
			while(counter < this.size) {
				System.out.print(current.val + "-->");
				current = current.getNext();
				counter++;
			}
			System.out.print("\n");
		}
	}
	
	
}
