import java.util.*;

  public class LinkedListDemo
   {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> list = new LinkedList<String>();
   // use add() method to add values in the linked list
          list.add("C");
          list.add("Java");
          list.add("Python");
          list.add("Javascript");
          

     // print the list
   System.out.println("LinkedList  Elements : " + list);

  // Removing all the elements from the linked list
    list.clear();

    System.out.println("After removing elements ,it wil be " + list);
  }
}
