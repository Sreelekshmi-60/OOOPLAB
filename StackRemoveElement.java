import java.io.*;
import java.util.*;

public class StackRemoveElement {
	public static void main(String args[])
	{

		// Creating an empty Stack
		Stack<String> stk = new Stack<String>();

		// Use add() method to add elements in the Stack
		
    	
      	stk.add("Linked List");
		stk.add("Stack");
		stk.add("Queue");
		stk.add("Array");
		//stk.add("!!");

		
		System.out.println("Stack Elements : " + stk);

		// Remove the element using remove()
		String rm = stk.remove(2);

		// Print the removed element
		System.out.println("Removed element: "	+ rm);

		// Print the final Stack
		System.out.println("After removing element "+rm+",remaining elements are : "	+ stk);
	}
}
