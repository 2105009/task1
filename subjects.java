/* magdalene kitolo@21/05009
 * this program propmts the user to enter marks of the five units and gives the summ and outputs the average in two decimal points
 * */
package kitolo;
import java.util.Scanner;
public class subjects. {
		{//introduction of variables to to thir data types
		int prog,data_structure,networking,Financial,entrepreurship, sum;
		double average;
		
	Scanner input=new Scanner(System.in);//(System .in )allows inputing of values
	System.out.println("enter your programming marks");
	prog=input.nextInt();// user inputs values
	System.out.println("enter your data structure");
	data_structure=input.nextInt();
	System.out.println("enter your networking");
	networking=input.nextInt();
	System.out.println("enter your financial mnagment");
	Financial=input.nextInt();
	System.out.println("enter your entrepreuship");
	entrepreurship=input.nextInt();
	sum=prog+data_structure+networking+Financial+entrepreurship;
	average=sum/5;
	System.out.printf(" your average is:"+average);
	

	}
	
	
	

}
