import java.util.Scanner;
public class IT24104167Lab5Q1{
	public static void main(String[]args){
		//creat class object
		Scanner input = new Scanner(System.in);
		//take user input
		System.out.print("Enter 1st Number : ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd Number : ");
		int num2 = input.nextInt();
		System.out.print("Enter 3rd Number : ");
		int num3 = input.nextInt();
		System.out.println();
		System.out.println("User entered numbers are : "+ num1 + "  "+ num2 + "  " + num3);
        
		String msg1;
		String msg2;
        
		//Check Smallest and Largest number
			msg1 = (num1 > num2 && num1 > num3) ? "The largest number is : "+num1:
				(num2 > num1 && num2 > num3) ? "The largest number is : "+num2:
				"The largest number is : "+num3;
			msg2 = (num1 < num2 && num1 < num3) ? "The smallest number is : "+num1:
				(num2 < num1 && num2 < num3) ? "The smallest number is : "+num2:
				"The smallest number is : "+num3;
        
		//display output
		System.out.println(msg1);
		System.out.println(msg2);
	}
}