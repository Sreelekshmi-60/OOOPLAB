import java.util.*;
 class SymmetricMatrix{
     public static void main(String[] args){
	   int a,b,i,j;
	   Scanner symm =new Scanner(System.in);
	   System.out.println("Enter number of rows and columns of  matrix:");
       a=symm.nextInt();
	   b=symm.nextInt();
     if(a!=b){
           System.out.print("\nPlease enter same number of rows and columns \n\nA symmetric matrix must be a square matrix\n");		   
	   }
	 else{
		   
	   int matrix[][]=new int[a][a];
	   System.out.println("Enter elements into matrix:");
	   for(i=0;i<a;i++){
	     for(j=0;j<a;j++){
		
	         matrix[i][j]=symm.nextInt();
		  }
		}
		System.out.println("The matrix is :");
		for(i=0;i<a;i++){
		   for(j=0;j<a;j++){
		     System.out.print(matrix[i][j]+" ");
			 }
			 System.out.println();
			}
		 for(i=0;i<a;i++){
		   for(j=0;j<a;j++){
                  if(matrix[i][j]!=matrix[j][i])
				  {
					  System.out.println("It is an Asymmetric matrix!!");
					  System.exit(1);
				  }
		   }
		 }
		 System.out.println("It is a Symmetric Matrix");
   }	
  }
}	   