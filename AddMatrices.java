import java.util.*;
class AddMatrices
{
  public static void main(String args[])
  {
    int a, b, c, d;
    Scanner arr = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns of matrix");
    a = arr.nextInt();
    b = arr.nextInt();
    System.out.println("Enter the number of rows and columns of matrix");
    c = arr.nextInt();
    d = arr.nextInt();
	if(a!=c || b!=d){
		System.out.println("Matrix addition is not possible!!\n\nPlease enter same number of rows and columns");
	}
	else{
		
    int first[][] = new int[a][b];
    int second[][] = new int[a][b];
    int sum[][] = new int[a][b];

    System.out.println("Enter the elements of first matrix");

    for (int i = 0; i < a; i++)
      for (int j= 0; j < b; j++)
        first[i][j] = arr.nextInt();

    System.out.println("Enter the elements of second matrix");

    for (int i = 0 ; i < a; i++)
      for (int j = 0 ; j < b; j++)
        second[i][j] = arr.nextInt();

    for (int i = 0; i< a; i++)
      for (int j=0; j < b; j++)
        sum[i][j] = first[i][j] + second[i][j]; 
    System.out.println("\nFirst matrix");
	for (int i= 0;i< a; i++)
    {
      for (int j= 0;j< b;j++){
        System.out.print(first[i][j] + " ");
       
	  }
  
     System.out.println();
    }
    System.out.println("\nSecond matrix");
	for (int i= 0;i< a; i++)
    {
      for (int j= 0;j< b;j++){
        System.out.print(second[i][j] + " ");
       
	  }
  
     System.out.println();
    }
	
	System.out.print("\n\nSum of the matrices:\n");

    for (int i= 0;i< a; i++)
    {
      for (int j= 0;j< b;j++){
        System.out.print(sum[i][j] + " ");

	  }
	 System.out.println();
      
	}
  }
}
}