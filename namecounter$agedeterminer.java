/*21/05009
 * magdalene kitolo
 * this program counts the numberof letters in an output and gives an output
 */

package Name;//the name of the folder

import java.util.Arrays;
import java.util.Scanner;// It is the easiest way to read input in a Java program
/**
 * @author maggie
 *
 */
public class namecounter$agedeterminer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String sname, display;
		 int age;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("what is your name : ");//user is allowed to enter the name
	      sname = s.nextLine();
	      
	      System.out.println("input your age after the sentence: ");//user is allowed to enter tthe age
	      age = s.nextInt();
	      
	      if(age%2 == 0) {//if there is no remainder then it is divisible
	    	  display = " your age is an even number";
	      } else {
	    	 display = " your age is an odd number";
	      }
	      
	      
	      
	      System.out.println("The length of your name is :"+sname.length() + "\n"+display);
}
}