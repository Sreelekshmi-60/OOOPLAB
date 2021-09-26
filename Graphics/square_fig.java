package Graphics;
import java.util.*;
 
public class square_fig implements figures
{

int side;
Scanner sc = new Scanner(System.in);
System.out.println("Enter side of the square :");
side=sc.nextInt();

//finding area of square
public void area()
 {
  System.out.print("Area of Square with side "+side+" = "+(side*side));
 }
}
