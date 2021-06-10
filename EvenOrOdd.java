import java.io.*;
class EvenOrOdd
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter an integer:");
	int number= Integer.parseInt(reader.readLine());
	int rem=number%2;
	if (rem==0)
	{
	  System.out.println("\n" +number +" is an Even number");
	  }
	  else{
	   System.out.println("\n" +number + " is an Odd number");
	   }
	}
}	