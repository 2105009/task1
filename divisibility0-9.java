/*magdalene kitolo
 *the program shows if the it is divisible between 0-9
 * */

package kitolo;//name of our folder
import java.util.Scanner;//// It is the easiest way to read input in a Java program
public class divisibility0-9 {//here is the class name
public static void main(String[]args)//this is the main function

{
	int num;
	Scanner input =new Scanner(System.in);
	System.out.print("hey child,kindly enter the number to be tested");
	num=input.nextInt();//allows input from the user

	System.out.print("\n");//this is the line break
if (num  %2==0) //the if function
{
	System.out.println(num+" is divisible by 2");
}

else if (num  %3==0) 
{
	System.out.println(num+ "is divisible by 3");
}		
if (num %4==0) 
{
	System.out.println(num+ " is divisible by 4");
}
else if (num  %5==0) 
{
	System.out.println(num+ " is divisible by 5");
}
else if (num  %6==0) 
{
	System.out.println(num+ "is divisible by 6");
}
else if (num  %7==0) 
{
	System.out.println(num+ " is divisible by 7");
}
else if (num  %8==0) 
{
	System.out.println(entered+ "  is divisible by 8");
}
else if (entered  %9==0) 
{
	System.out.println(entered+ " is divisible by 9");
}
else 
{
	System.out.println(entered+ "is not within 0-9 divisibility");
}
System.out.print("\n");
}
}
