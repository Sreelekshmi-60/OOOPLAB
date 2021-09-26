import java.util.*;


public class HashSetDemo
{
    public static void main(String[] args) {
        //Create hash set
          HashSet<String> set = new HashSet<String>();
          //Add elements to hash set
          set.add("Circle");
          set.add("Square");
          set.add("Triangle");
          set.add("Rectangle");
          
          
           System.out.print("Hash set elements : ");

          // set Iterator
        Iterator<String> i = set.iterator();
    // Iterate the hash set
       while (i.hasNext())
        {
              System.out.print(i.next()+" ");
         }
          // Again Checking for the empty set
        System.out.println("\nIs hash set empty: " + set.isEmpty());
        //no:of elements in hash HashSet
        System.out.println("Number of elements in the Hash Set: " + set.size());
        // Clearing the set using clear() method
        set.clear();
        System.out.println("Hash set is cleared");
        System.out.println("Is  hash set empty: " + set.isEmpty());
}
}
