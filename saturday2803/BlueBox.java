package lab.saturday2803;

public class BlueBox {
	 
	public static void main (String[] args) {
		
		Box defaultBox = new Box(); // will take 1st constructor 
		
		System.out.println(defaultBox.compute());
		
		Box smallBox = new Box(5, 5, 2); // will take 2nd constructor because that one has declared w/h/l which you can change
		
		System.out.println(smallBox.compute());
		
	}
}
