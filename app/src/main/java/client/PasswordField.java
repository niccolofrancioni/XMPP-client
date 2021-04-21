package client;

import java.io.IOException;
import java.util.Scanner;

public class PasswordField {

	 public static String readPassword () {
	      EraserThread et = new EraserThread();
	      Thread mask = new Thread(et);
	      mask.start();
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      
	     String password = scanner.nextLine();
	      
	      et.stopMasking();
	      // return the password entered by the user
	      return password;
	      }
}
