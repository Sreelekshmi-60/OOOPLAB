package Graphics;
import java.util.*;
import java.io.*;

 interface figures
     {
        //compiler treat these as abstract methods
          abstract void area();

        default void heading(String str)
         {
                 System.out.println("\nArea of "+str);
                 System.out.println("*------------------------------*\n\n");
         }
     }
public class rectangle_fig implements figures 
{

//int length,breadth;

Scanner sc = new Scanner(System.in);
System.out.println("Enter length of rectangle: ");
int length=sc.nextInt();
System.out.println("Enter breadth of rectangle: ");
int breadth=sc.nextInt();
//finding area of rectangle
public void area()
{
	
System.out.print("Area of Rectangle with length "+length+" and breadth "+breadth+" = "+(length*breadth));
}
}
