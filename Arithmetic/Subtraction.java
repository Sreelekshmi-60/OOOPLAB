package Arithmetic;
import java.util.*;
import java.io.*;


public class Subtraction implements TestInterface
{
  int x,y;
public  void calculate()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the 1st num:");
    x = sc.nextInt();
    System.out.println ("Enter the 2nd num:");
    y = sc.nextInt();
    
    System.out.println ("Difference = "+(x-y));
  }


}