import java.util.Scanner;
public class changeMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter amount from 1 to 99 ");
		int cents = scan.nextInt();
		
		final int QUARTERS = 25;
		final int DIMES = 10;
		final int NICKELS = 5;
		final int PENNIES = 1;
		
		System.out.println(cents + " cents in coins can be given as: ");
	
		int totalQuarter = cents / QUARTERS; 
		cents %= QUARTERS;
		int totalDimes = cents / DIMES;
		cents %= DIMES;
		int totalNickel = cents / NICKELS;
		cents %= NICKELS;
		int totalPenny =  cents / PENNIES;
		cents %= PENNIES;  
		
		
		System.out.println(totalQuarter + " quarters"); 
		
		System.out.println(totalDimes + " dimes");

		System.out.println(totalNickel + " nickels and");

		System.out.println(totalPenny + " pennies");

		
		scan.close(); 
		
}

}