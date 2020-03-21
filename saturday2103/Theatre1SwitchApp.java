package lab.saturday2103;
import java.util.*;
public class Theatre1SwitchApp {
    
	
	public static void main(String args[]){
		
		// declare instance variable to store the day and prices
		String day;
		int price1;
		int price2;
		Theatre1Switch t = new Theatre1Switch();
		// declare a variable named scan to be able to work with objects of type Scanner
		   Scanner input = new Scanner(System.in);
		   
	    //prompt user to enter the day of the week and save it to the variable day
		   System.out.println("Please, enter a week day!");
		   day = input.next().toLowerCase();
		
		   
		   	// use (i.e. by calling/invoking) the setter method setDay()
	    	// to store in the instance variable named day of the object t the day provided by the user
	    	t.setDay(day);
	        
	        // processing: calculate the price of a ticket in the given day
	    	t.calculatePrice(day);
	    	
	        // output
	        // invoke/call the getter method getPrice() to retrieve the cost of the ticket	
	    	int tPrice1 = t.getPrice1();
	    	
	    	int tPrice2 = t.getPrice2();
		   
		   
		                
		            
		                
		
	}
	}