import java.util.*;
class SavingsAccount 
{
  static float annualInterestRate;
 private float savingsBalance;
 public SavingsAccount(float  balance)
 {
   savingsBalance=balance;
 }
 
float monthlyinterest()
 {
 return savingsBalance*annualInterestRate/12;
 }
 
//modifying static variable
 public static void modifyInterestRate(float value)
 {
   annualInterestRate=value;
  }
}

class interest{

public static void main(String args[]){
	
float a,b;
SavingsAccount saver1 = new SavingsAccount(2000);
SavingsAccount saver2 = new SavingsAccount(3000);
//savings at interest rate 4%
saver1.modifyInterestRate(4);

a=saver1.monthlyinterest();
b=saver2.monthlyinterest();
System.out.println("\nInterest and Balance  at 4% Annual Interest Rate\n\nInterest of saver1 = "+a+" and Balance of saver1 = "+(a+2000)+"\n");
System.out.println("\nInterest of saver2 = "+b+" and Balance of saver2 = "+(b+3000)+"\n\n");

//savings at interest rate 5%

saver1.modifyInterestRate(5);

a=saver1.monthlyinterest();
b=saver2.monthlyinterest();
System.out.println("\nInterest and Balance  at 5% Annual Interest Rate\n\nInterest of saver1 = "+a+" and Balance of saver1= "+(a+2000)+"\n");
System.out.println("\nInterest of saver2 = "+b+" and Balance of saver1= "+(b+3000)+"\n\n");
}
}

