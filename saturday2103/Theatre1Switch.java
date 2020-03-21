package lab.saturday2103;

public class Theatre1Switch {
  
		// declare instance variable to store the day
		private String day;
		
	    // declare instance variable to store the price of a ticket based on the given day
		private int price1 = 20;
		private int price2 = 30;
	
		
		/*public Theatre1Switch() {
			this.day = "";
			this.price1 = price1;
			this.price2 = price2;	
		}*/
		
		
		// declare a  setter method to retrieve the ticket price
		public void setDay(String day2) {
			this.day = day;
			
		}
		

		 // declare a  getter method to retrieve the ticket price
		public int getPrice1() {	
			return price1;
		}
	   
		public int getPrice2() {
			return price2;
		}
 
		//processing with Switch
		
		public void calculatePrice(String day) {
		   switch (day.toLowerCase()) {
		            case "monday":
		            case "tuesday":      
		            case "wednesday":
		            case "thursday":
		                System.out.println("The price of the theatre ticket for "+ day + " is "+ price1 + " Eur ");
		                break;
		                
		            case "friday":
		            case "saturday":	
		            case "sunday":	
		                System.out.println("The price of the theatre ticket for "+ day + " is "+ price2 + " Eur ");
		                break;
		            default: 
		                System.out.println("Incorrect input! Please, try again!");    
}
}


		
}


