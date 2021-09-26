import java.io.*;
class StringAndStringBuffer
 {
	public static void main(String[] args)
	{
	StringBuffer str = new StringBuffer("JAVA");
		int l = str.length();
		int c = str.capacity();
		System.out.println("Length of string JAVA = " + l);
		System.out.println("Capacity of string JAVA = " + c);
    
    System.out.println("After Appending = "+str.append("  PROGRAMMING"));
    
    System.out.println("After inserting '-'at 5th position = "+str.insert(5, "-"));
    
    System.out.println("Reversed String = "+str.reverse());
    
	str.reverse();
	
    System.out.println("After deteting  last 4 characters = "+str.delete(14,18));
    
    System.out.println("After deteting  character at 5th  position = "+str.deleteCharAt(5));
   
    System.out.println("Replacing characters with 'A' from 0th to 4th position = "+str.replace(0,4,"A"));

          String str1="STRING OPERATIONS";//creating string by java string literal
          char ch[]={'w','e','l','c','o','m','e'};
          String str2=new String(ch);//converting char array to string
          String str3=new String("Hai ");//creating  string by new keyword
          System.out.println("After converting character array ="+str2);
          System.out.println("String str1 = "+str1);
          System.out.println("String str3 = "+str3);
          char ch1 = str1.charAt(2);  
          System.out.println("The character  at the 3rd position [index 2] of string "+str1+" = "+ch1);
          
          System.out.println("After concatenation of str3 with str2 = "+str3.concat(str2));
           
String strlower=str2.toLowerCase();
System.out.println("str2 in Lowercase : "+strlower);

String strupper=str2.toUpperCase();
System.out.println("str2 in Uppercase : y"+strupper);
String str4="  The string   ";
System.out.print("Without trimming: ");
System.out.println(str4+"without trim");
System.out.print("With trimming:");
System.out.println(str4.trim()+" with trim");
}
}


