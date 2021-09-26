import java.util.*;
import java.io.*;
class MapOperations
 {
	public static void main(String args[])
	{
		
		Map<String, String> map = new HashMap<>();
	
		map.put("Circle", "radius");
		map.put("Square", "side");
		map.put("Triangle", "base");
    	map.put("Rectangle", "length");
System.out.println("\nInitial Map Elements : "+map);
map.put("Triangle", "height");
System.out.println("\nUpdated Map Elements : " + map);
map.remove(2);
  System.out.println("\nAfter removing second element  : "+map);

	}
}
