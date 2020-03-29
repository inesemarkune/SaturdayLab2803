package lab.saturday2803;

public class Company {
    public static void main(String[] args) {
    	
        //declare and create 3 objects(as a employee1,2,3) and set params
    	Employee e1 = new Employee("Inese" , "Main Cashier" , "SIA Tavex", 800);
    	Employee e2 = new Employee("Alise" , "Logistics operator" , "SIA Logistics", 500);
    	Employee e3 = new Employee("Ieva" , "Timetable Administrator" , "MTG Baltic", 1000);
    	
    	
    	System.out.println("***");
    	System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();
    	
    	
    	//get initial salaries 
    	 double salary1 = e1.getSalary();
         double salary2 = e2.getSalary();
         double salary3 = e3.getSalary();
    	
    	
    	
        //set department for your employees
    	e1.setDepartment("Elizabete");
    	e2.setDepartment("Pardaugava");
    	e3.setDepartment("London 3");
    	
    	
        System.out.println("After 1 year inside the company: ");
        System.out.println();
        
        
        //set to change your employee promotion from position to salary
        e1.setPosition("Branch Manager");
        e1.setSalary(1500);
        
        e2.setPosition("Office Administrator");
        e2.setSalary(1000);
        
        e3.setPosition("Project Developer");
        e3.setSalary(2000);
        
        
        //calculate employees salary difference after 1 year
        
        double newSalary1 = e1.getSalary();
        double difference1 = newSalary1 - salary1;
        
        double newSalary2 = e2.getSalary();
        double difference2 = newSalary2 - salary2;
        
        double newSalary3 = e3.getSalary();
        double difference3 = newSalary3 - salary3;
        
        
        //out print your employees
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();
        
        System.out.println("The salary raise for employee " + e1.getName()+ ", Id = " + e1.getId() +  " is " + difference1 + " EUR");
        System.out.println("The salary raise for employee " + e2.getName()+ ", Id = " + e2.getId() + " is " + difference2 + " EUR");
        System.out.println("The salary raise for employee " + e3.getName()+ ", Id = " + e3.getId() + " is " + difference3 + " EUR");
    
    }
}  