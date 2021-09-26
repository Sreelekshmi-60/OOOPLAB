package Arithmetic;
import java.util.*;
import java.io.*;


public class Division implements TestInterface
{
  int x,y;
  
public  void calculate()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the first number :");
    x = sc.nextInt();
    System.out.println ("Enter the second number :");
    y = sc.nextInt();
    
    System.out.println ("Quotient = "+(x/y));
  }


}
