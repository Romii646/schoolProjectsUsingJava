// Aaron Cortina cortina.aaron@titans.easternflorida
package mainJavaCOP;

import java.util.Scanner;

public class Sales {
// start of main program
	public static void main(String[] args) {
// main declared variables;
		double merchSold = 0;
		String quit = "zzzz";

// created commission object
		Commission salesPerson = new Commission(merchSold);

// Scanner declared
		Scanner input = new Scanner(System.in); // scanner object

// prompt user for sales person first and last name
		System.out.println("Please enter sales person's first name or zzzz to quit program");
		String firstName = input.next();
		System.out.println("Please enter sales person's last name or zzzz to quit program");
		String lastName = input.next();
		
// while structure that begins recording sales person's sold amount

		while(!firstName.equals(quit) && !lastName.equals(quit)) {
			System.out.printf("Please enter product code for each item sold by sales person %s%n", firstName);
			System.out.print("Code(1) = Pair of Jeans \nCode(2) = Hiking Boots \nCode(3) = Kayak \nCode(4) = Fishing rod \n");
			System.out.print("Enter code: ");
			int code = input.nextInt();
			while(code != -1) {
				switch(code) {
				   case 1:
					      merchSold = merchSold + 239.99;
				     break;
				   case 2:
					      merchSold = merchSold + 129.75;
				     break;
				   case 3:
					      merchSold = merchSold + 99.95;
				     break;
				   case 4:
					      merchSold = merchSold + 350.89;
				     break;
				   default:
					      System.out.print("Sorry entered wrong code number");
				}// end of switch structure
			  
			   System.out.printf("Total merchandise sold: $%.2f%n",merchSold);
			   System.out.println("Please enter product code for each item sold by sales person or -1 to quit");
			   System.out.print("Code(1) = Pair of Jeans \nCode(2) = Hiking Boots \nCode(3) = Kayak \nCode(4) = Fishing rod \n");
			   System.out.print("Enter code: ");
			   code = input.nextInt();
			   System.out.flush();
			} // end of while loop with switch code
			// sales person's commission
			salesPerson.setTotalSold(merchSold);
			System.out.printf("%s %s's weekly payout is $%.2f%n", firstName, lastName, salesPerson.getTotalSold());
			System.out.println("Please enter sales person's first name or zzzz to quit program");
			firstName = input.next();
			if(!firstName.equals(quit)) {
			   System.out.println("Please enter sales person's last name or zzzz to quit program");
			   lastName = input.next();
			   merchSold = 0;
			}// end of if statement
		}// end of while loop structure with first and last name not equal to quit
		
		System.out.print("End of Program");
input.close();	
  }
}
