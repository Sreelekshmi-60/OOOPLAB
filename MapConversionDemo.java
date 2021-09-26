import java.util.*;
import java.util.stream.*;

public class MapConversionDemo
 {
   public static void main(String args[]) {
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "One");
      map.put(3, "Three");
      map.put(5, "Five");
      map.put(7, "Seven");
      map.put(9, "Nine");
      System.out.println("HashMap Elements = " + map);
      Map<Integer, String> Tmap = new TreeMap<>();
      Tmap.putAll(map);
      System.out.println("\nAfter converting Hashmap to TreeMap : " + Tmap);
   }
}
