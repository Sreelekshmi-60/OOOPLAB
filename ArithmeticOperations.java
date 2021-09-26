import Arithmetic.Addition;
import Arithmetic.Subtraction;
import Arithmetic.Multiplication;
import Arithmetic.Division;

import java.util.*;
import java.io.*;
public class ArithmeticOperations
{
    public static void main(String args[])
    {
         int ch;

           Addition add = new Addition();
          Subtraction sub = new Subtraction();
          Multiplication mul = new Multiplication();
          Division div = new Division();
          do
          {
            System.out.println("\n\nARITHMETIC OPERATIONS\n\n");
            System.out.println("1.Addition ");
            System.out.println("2.Substraction ");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
			System.out.println("5.Exit");
		    System.out.println("Enter your choice :");
		 
          Scanner sc = new Scanner(System.in);
          ch=sc.nextInt();

          switch(ch)
          {
            case 1:
                  add.calculate();
                  break;
            case 2:
                  sub.calculate();
                   break;
            case 3:
                  mul.calculate();
                  break;
            case 4:
                  div.calculate();
                  break;
            case 5:
			       System.exit(1);
            default: System.out.println("Invalid Choice");
                      break;
          }}
          while(ch<=5);


    }
}
