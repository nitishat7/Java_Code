package Assignment;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class TicketBooking {
		public static void main(String[] args) throws NumberFormatException, IOException {
			int option;
			double price_gold=200;
			double price_silver=150;
			
			int numOfTicket;
			
			System.out.println("[1].Golden ticket [2].Silver ticket");
	        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("[*]Enter your option 1 0r 2:");
	        option = Integer.parseInt(bfr.readLine());
	        if(option == 1) {
	        	System.out.println("[*]Enter number of tickets:");
	            numOfTicket = Integer.parseInt(bfr.readLine());
	            double total = (double)numOfTicket * price_gold;
	            System.out.println("Your movie is booked with gold ticket and your total price is Rs"+total);
	}
	        else if(option == 2){
	             System.out.println("[*]Enter number of tickets:");
	             numOfTicket = Integer.parseInt(bfr.readLine());
	             double total = (double)numOfTicket * price_silver;
	             System.out.println("Your movie is booked with silver ticket and your total price is Rs"+total);
	}
	        else {
	         System.out.println("[*]Error:Please enter a valid number 1 0r 2");
	          }
	}

}
