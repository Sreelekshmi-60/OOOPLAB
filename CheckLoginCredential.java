import java.util.Scanner;
     
   //labcycle pgm 1
  class UsernameException extends Exception {
     
     public UsernameException(String msg) {
      super(msg);
     }
    }
     
    class PasswordException extends Exception {
     
     public PasswordException(String msg) {
      super(msg);
     }
    }
     
    public class CheckLoginCredential {
     
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username, password,pswd;
      
      System.out.print("Enter username :: ");
      username = s.nextLine();
      
      System.out.print("Enter password :: ");
      password = s.nextLine();
	
      
      int length = username.length();
	 
	  //int length1 = password.length();
      
      try {
       if(length < 6)
        throw new UsernameException("Username must be greater than 6 characters ???");
       else if(!password.equals("password")) 
        throw new PasswordException("\nWrong password\nType correct password\nPassword must be same as given!!");
       else
        System.out.println("Login Successful !!!");
      }
      catch (UsernameException u) {
       System.out.print(u + "\n");
      }
      catch (PasswordException p) {
       System.out.print(p + "\n");
      }
      
      finally {
       System.out.println("Login Process is terminated.");
      }
      
     }
    }