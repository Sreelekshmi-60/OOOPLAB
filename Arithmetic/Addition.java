package Arithmetic;
import java.util.*;
import java.io.*;
interface TestInterface
{
  abstract  void calculate();
}

public class Addition implements TestInterface
{
  int x,y;
public  void calculate()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the first number :");
    x = sc.nextInt();
    System.out.println ("Enter the second number :");
    y = sc.nextInt();
    
    System.out.println ("Sum = "+(x+y));
  }


}
