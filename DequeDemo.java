import java.util.*;

public class DequeDemo
 {
    public static void main(String[] args) {
        //Declare Deque object
        Deque<Integer> deque = new LinkedList<Integer>();
        // add elements to the queue using various methods
        deque.addFirst(5);           //add ()
        deque.add(10);      
        deque.push(15);        
        deque.offer(20);        
        deque.offerFirst(25);   
        deque.offerLast(30);
		
        System.out.print("Dequeue Elements :");
        Iterator itr = deque.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
		}
        // Pop () method
        System.out.println("\nPopped Element  :" + deque.pop());
        System.out.println("\nAfter pop:" + deque);
        deque.removeFirst(); //removing First element
        deque.removeLast(); //removing last element ()
        System.out.println("\nAfter removing first and last elements : " + deque);
        deque.poll();
        System.out.println("\nAfter removing  an element from the beginning of the Deque : " + deque);
        deque.pollLast();
        System.out.println("\nAfter removing an element from the end (tail) of the Deque : " + deque);
        deque.pollFirst();
        System.out.println("\nAfter removing  an element from the beginning of the Deque : " + deque);

   }
}
