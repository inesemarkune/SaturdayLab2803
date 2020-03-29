package lab.saturday2803;

import java.util.Scanner;

public class ExchangeApp {

	public static void main(String[] args) {
		
		//TODO: declare local variable 
		double amnt, rate, conv;
		char rep;
		
		
		//TODO: declare objects
		Exchange defaultEx = new Exchange();
		Exchange ex = new Exchange();
		
		Scanner input = new Scanner(System.in);
		
		
		//TODO: input
		//TODO: setMethod to put input value
	
		System.out.println(" Please enter amount to be converted: ");
		amnt = input.nextDouble();
		defaultEx.setAmount(amnt);
		
		
		
		//TODO: setMethod to set rate (acquired from the Scanner)
		System.out.println(" Please enter the conversion rate: ");
		rate = input.nextDouble();
		defaultEx.setRate(rate);
		
		
		//TODO: process 
		conv = defaultEx.getConversion();
		
		//TODO: output
		System.out.println(+ amnt + " at a rate of " + rate + " is " + conv );
		
		
		
	}//end main

}// end class
