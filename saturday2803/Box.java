package lab.saturday2803;

public class Box {
	
	//declare variables
	double width;
	double height;
	double length;
	
	Box(){  // 1st constructor
		width = 10;
		height = 10;
		length = 5;
	}
	
	public Box(double width, double height, double length ) { // 2nd constructor
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double compute() {
		return width * height * length;
	}
	
	
}//end class
