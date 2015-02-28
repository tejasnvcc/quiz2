//import javax.swing.JOptionPane;

import java.util.Scanner;

public class UserAuthentication {
	
  private static String correctUsername = "John Smith";
  private static String correctPassword = "5555";
  private static String username;
  private static String password; 

  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       
    System.out.println("Please enter your username."); 
    username = scan.nextLine();
    
    System.out.println("Please enter your password."); 
    password = scan.nextLine();
    
    boolean chk = authentication(username, password); 
    if (chk == true ) {
    	System.out.println("Welcome, " + username + "!"); }
    else {
    	System.out.println("Invalid username or password!"); }
   
    scan.close();
  }  
      
  public static boolean authentication(String username, String password) {
	  
	 boolean status = false;
	 
     if ((username.equalsIgnoreCase(correctUsername)) && (password.equalsIgnoreCase(correctPassword))) {
    	  status = true; }
     else {
     	  status = false; }
     
     return status;
     
     
  }
  
}