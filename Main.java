import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
//		Node node1 = new Node("Hello", null);
//		Node node2 = new Node("Bye", null);
//		Node node3 = new Node("Ethan", null);
//		Node node4 = new Node("Kim", null);
//		Node node5 = new Node("Die", null);
//
//		
//		LinkedList newList = new LinkedList();
//		newList.addToHead(node1);
//		newList.addToHead(node2);
////		newList.addToHead(node3);
////		newList.addToHead(node4);
////		newList.addToHead(node5);
//		
//		Node removed = newList.removeFromHead();
//		//newList.removeFromTail();
//		System.out.println(newList.size);
//		newList.printList();
//		System.out.println(removed.val);
//		
//		
//		
		
		HashMap<String, LinkedList> map = new HashMap<>();
		
		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Command: ");

	    String input = myScanner.nextLine();  // Read user input
	    
	    while(!(input.toLowerCase().equals("stop"))) {
	    	//do things
	    	switch (input) {
	    	case "create":
	    		//create a new linked list
	    		System.out.print("Name of Linked List: ");
	    		String createString = myScanner.nextLine();
	    		
	    		map.put(createString, new LinkedList());
	    		break;
	    	case "add to head":
	    		//add to head
	    		System.out.print("Linked list to add to: ");
	    		String addToHeadList = myScanner.nextLine();
	    		System.out.print("Value to add: ");
	    		String addToHeadValue = myScanner.nextLine();
	    		
	    		map.get(addToHeadList).addToHead(new Node(addToHeadValue, null));
	    		break;
	    	case "remove from head":
	    		//remove from head
	    		System.out.print("Linked list to remove from: ");
	    		String removeFromHeadList = myScanner.nextLine();
	    		map.get(removeFromHeadList).removeFromHead();
	    		break;
	    	case "print":
	    		//print a list
	    		System.out.print("Linked list to print: ");
	    		String printList = myScanner.nextLine();
	    		map.get(printList).printList();
	    		break;
	    	case "help":
	    		System.out.println("\"help\": shows all the command options");
	    		System.out.println("\"create\": make a new linked list");
	    		System.out.println("\"add to head\": add to the head of a linked list");
	    		System.out.println("\"remove from head\": remove from the head of a linked list");
	    		System.out.println("\"print\": prints out the linked list");
	    		break;
	    	//etc
	    	default:
	    		System.out.println("Not a valid input");
	    	}
	    	
	    	
	    	//ask for input again
	    	System.out.print("Command: ");
	    	input = myScanner.nextLine();
	    }
	    
		
	}

}
