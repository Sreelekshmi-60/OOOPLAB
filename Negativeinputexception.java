import java.io.*;

class inputValidation extends Exception {
     
     public inputValidation(String msg) {
      super(msg);
     }
    }
    
class Negativeinputexception{
 public static void main(String[] args) throws IOException {
  
   int n,number;
   float sum = 0;
   float avg;
   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   System.out.println(" Enter Total number of Elements:");
   n = Integer.parseInt(br.readLine());
   
   System.out.println(" Enter Elements:");
   try {
    for(int i = 0; i < n; i++) {
         number = Integer.parseInt(br.readLine());
   
         if(number < 0)
         throw new inputValidation("Please enter a positive Number");
         else
         sum = sum + number;
         }
        avg= sum/n;
        System.out.println("Average:" + avg);
      
       }
       catch (inputValidation ex) {
       System.out.print(ex + "\n");
       }
        
 }
}