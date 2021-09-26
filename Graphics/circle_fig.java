package Graphics;
import java.util.*;
import java.io.*;

public class circle_fig implements figures
{

float rad;

Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle :");
float rad=sc.nextFloat();

//finding area of circle
public void area()
{

  System.out.println("Area of Circle with radius "+rad+" = "+(3.14*rad*rad));

}

}
