// a calling class to sales projects
package mainJavaCOP;

public class Commission {
   private double totalSold; // accumulated amount of merchandise sold by sales person
   
//start of constructor
   public Commission(double totalSold) {
	   this.totalSold = totalSold;
   }
   
   public void setTotalSold(double totalSold) { // method that sets merchandise sold by salesperson assigned to totalSold
	   
		   this.totalSold = totalSold;
	   
   }// end of method
   
   public double getTotalSold() {
// method declared variables
	   double payOut = 0;
	   double temp;
	   temp = totalSold;
	   // computing sales person's earnings
	   payOut = ((temp * 1.09) + 200) - totalSold;
	   
	   return payOut; // returning value back to caller
   }
}//end of class
