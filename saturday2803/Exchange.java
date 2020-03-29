package lab.saturday2803;

public class Exchange {

	//TODO: declare PRIVATE data members - amount, rate, conversion
	
	private double amount;
	private double rate;
	private double conversion;
	
	
	//constructor(empty) - prints error if you forgot to SET something
	public Exchange() {
			this.setAmount(amount);
			this.setRate(rate);
		}
	

	//constructor(with parameters - amount, rate
	public Exchange(double amount, double rate) {
		this.setAmount(amount);
		this.setRate(rate);
	}


	//set methods (for amount and rate)

	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

	
	//calculation method = conversion
	public double conversion() {
		return amount * rate;
	}

	
	//get method (for result - return conversion)
	public double getConversion() {
		return conversion();
	}

	
	

	
	
	
	
	
	
	
	
	
}
