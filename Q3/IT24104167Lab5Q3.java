import java.util.Scanner;
public class IT24104167Lab5Q3{
	public static void main(String[]args){
		//creat class object
		Scanner input = new Scanner(System.in);
		
		//declare variable
		final double roomChargePerDay = 48000.00;
		final double disFor3_4Days = 0.1;
		final double disUpTo5Days = 0.2;
        
		//take user input
		System.out.print("Enter start date (1-31) : ");
		int startDate = input.nextInt();
		System.out.print("Enter end date (1-31) : ");
		int endDate = input.nextInt();
        
		//validation of start date and end date
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			System.out.println("Error : Days must be a between 1 and 31");
			return;
		}

		//validation of start date
		if (startDate > endDate){
			System.out.println("Error : Start date must be less than End date");
			return;
		}
        
		System.out.println();
		//calculate reserved days
		int reservedDays = (endDate - startDate + 1);
		System.out.println("Room Charge Per Day : " + roomChargePerDay);
		System.out.println("Number of days reserved : " + reservedDays);
        
		//discount
		double discountRate;
        
		if (reservedDays >= 5 ){
			discountRate = disUpTo5Days;
		}
		else if (reservedDays >= 3 ){
			discountRate = disFor3_4Days;
		}
		else {
			discountRate = 0;
		}
        
		//calculate total amount and discount
		double amount = reservedDays * roomChargePerDay;
		double discount = amount * discountRate;
		double finalAmount = amount - discount;
        
		//display output
		System.out.println("Total Amount to be Paid : " + finalAmount);
	}
}