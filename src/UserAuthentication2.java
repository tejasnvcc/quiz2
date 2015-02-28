import javax.swing.JOptionPane;
public class UserAuthentication2 {
	private static String correctUsername = "John Smith";
	private static String correctPassword = "5555";
	private static String username;
	private static String password;

   public static void main(String [] args) {
	   
      //Scanner keyboard = new Scanner(System.in);
      username = JOptionPane.showInputDialog("Enter username.");
      //String username = keyboard.next(); 
      password = JOptionPane.showInputDialog("Enter password.");
      
      boolean chk = UserAuthentication.authentication(username, password);
      
      if (chk == true){
    	  JOptionPane.showMessageDialog(null, "Welcome " + username); }
      
      else {
    	  JOptionPane.showMessageDialog(null, "Invalid username and/or password. Please try again."); }
      
      }
   
}   