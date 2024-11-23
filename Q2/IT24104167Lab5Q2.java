import java.util.Scanner;
public class IT24104167Lab5Q2{
	public static void main(String[]args){
		//creat class object
		Scanner input = new Scanner(System.in);
			
		//take user input
		System.out.print("Enter the number of new members introduced : ");
		int noOfMembers = input.nextInt();
        
		System.out.println();

		//Check prize
		switch (noOfMembers)
			{
				case 0 : System.out.println("No Prize");
					break;
				case 1 : System.out.println("Prize is a : Pen");
					break;
				case 2 : System.out.println("Prize is an : Umbrella");
					break;
				case 3 : System.out.println("Prize is a : Bag");
					break;
				case 4 : System.out.println("Prize is a : Travelling Chair");
					break;		            
				default : System.out.println("Prize is a : Headphone");
					break;
			}
	}
}