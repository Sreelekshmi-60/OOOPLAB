public class BubbleSort
 {
   public static void main(String args[]) {
	String str[] = { "Savitha", "Ansu", "Manu", "Kamala", "Vinod"};
	String temp;
	System.out.print("\nGiven String is :");
	for(int i=0;i<str.length;i++){
	System.out.print(str[i]+" ");
	}
	System.out.print("\n\nStrings in sorted order:");
	for (int i= 0; i< str.length; i++) {
   	   for (int j= i+ 1; j < str.length; j++) 
	   {
		if (str[j].compareTo(str[i]) < 0) 
		{
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
	   }
	   System.out.print(str[i]+" ");
	}
   }
}