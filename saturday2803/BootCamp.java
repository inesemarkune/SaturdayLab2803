package lab.saturday2803;

public class BootCamp {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // uses the default constructor
		System.out.println(s1);
		
		Student s2 = new Student(); 
		
		Student s3; 
		s3 = s1;
		
		s1.setName("AM");
		String myName;
		
		myName = s1.getName();
		System.out.println("s1.name:" + myName);
		
		myName = s3.getName();
		System.out.println("s3.name:" + myName);
		
		myName = s2.getName();
		System.out.println("s2.name:" + myName);
		
		s2.setName("TT");
		System.out.println(s2);
		
		myName = s2.getName();
		System.out.println("s2.name:" + myName);	
		
		
		Student s4 = new Student("ED");
		myName = s4.getName();
		System.out.println("s4.name:" + myName);
	}

}
