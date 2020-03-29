package lab.saturday2803;

/**
 * @author inese
 *
 */
public class Student {
	
		// declare variables
		private String name;
		
	
	public Student() {
		this.setName("Error, name didn't set !");
	}
	
	public Student(String bootcampName) {
		this.setName(bootcampName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // this set is only for empty constructor
		this.name = name;
	}

	
	
	
}
