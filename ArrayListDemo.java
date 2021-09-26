import java.util.*;

class ArrayListDemo
{
   public static void main(String args[]){
      //create an ArrayList
      ArrayList<String> shapes = new ArrayList<String>();
	  
      //adding elements to the ArrayList 
      shapes.add("Circle");
      shapes.add("Triangle");
      shapes.add("Rectangle");
      
      System.out.println("\nArrayList 1 Elements :" + shapes);
      //add an element at index 1 using add method overload
       shapes.add(1,"Square");
      //print the list
      System.out.println("\nArrayList 1 after adding 'Square' at index 1:" + shapes);
      //define a second list
      ArrayList<String> shapes1 = new ArrayList<String>(Arrays.asList("Pentagon", "Hexagon","Octagon"));
      System.out.println("\nArrayList 2 Elements :" + shapes1);
	  
	  //use addAll method to add the list to ArrayList at index 4
     shapes.addAll(shapes1);
      //print the list
      System.out.println("\nArrayList 1 after adding ArrayList 2 :" + shapes);
     shapes.remove(4);

      System.out.println("\nArrayList after removing element at index 4:" + shapes);
 
      shapes.remove("Circle");
	  System.out.println("\nArrayList after removing 'Circle' :" + shapes);
	  
	  shapes.trimToSize();
	  System.out.println("\nArrayList Size after trimToSize() operation: "+shapes.size());
	  
	 //call indexOf() and lastIndexOf() methods to check the indices of specified elements
     System.out.println("\nindexOf(Hexagon) : " + shapes.indexOf("Hexagon"));
     System.out.println("\nlastIndexOf(Hexagon) : " + shapes.lastIndexOf("Hexagon"));

      
      
	  
     shapes.removeAll(shapes1);
     System.out.println("\nArrayList 1 after  removing all elements  from  ArrayList 2 :" +shapes);
     
	 
	 shapes.clear();
     System.out.println("\nArrayList after clearing all elements: "+shapes);
	 
 }
}
