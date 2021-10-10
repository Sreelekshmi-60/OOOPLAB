import java.io.File;

class Filedemo {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:/Users/JANVI/Desktop/MCA S2");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}