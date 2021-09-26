import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(35);
        set.add(67);
        set.add(95);
        set.add(72);
        set.add(14);
        set.add(2);
        set.add(59);
        set.add(10);

        System.out.println("TreeSet Elements: " + set);

        /*
         * To get the a reverse order view of this TreeSet, use
         * the descendingSet method
         */
        Set<Integer> reverseSet = set.descendingSet();

        //get an iterator
        Iterator<Integer> itr = reverseSet.iterator();

        System.out.print("\nReverse set : ");
        while(itr.hasNext()){
            System.out.print( itr.next()+" " );
        }
    }
}
