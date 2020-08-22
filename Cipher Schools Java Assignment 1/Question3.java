import java.util.ArrayList;

class Employee{
	int empId;
	String empName, empDesignation, empLocation;
	double salary;
	public Employee(int empId, String empName, String empDesignation, String empLocation, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empLocation = empLocation;
		this.salary = salary;
	}
	
}
public class Question3 {

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Raj", "SDE2", "Mumbai", 50000));
		employee.add(new Employee(2, "Name2", "SDE1", "Kolkata", 50000));
		employee.add(new Employee(3, "Rahul", "Backend Developer", "Delhi", 4000));
		employee.add(new Employee(4, "Name4", "Frontend Developer", "Mumbai", 60000));
		employee.add(new Employee(5, "Ramesh", "SDE", "Digha", 20000));
		employee.add(new Employee(6, "Radhika", "SciencE", "Manipur", 10000));
		employee.add(new Employee(7, "Raja", "SDE", "Chennai", 50000));
		employee.add(new Employee(8, "Mondal", "System Architect", "Goa", 70000));
		employee.add(new Employee(9, "Pulkit", "Designer", "Mumbai", 30000));
		employee.add(new Employee(10, "Subhadip", "Civil ServicE", "Meghalaya", 100000));
		
		System.out.println("All Employee name : ");
		employee.stream().map(name->name.empName).forEach(name->System.out.println(name));
		
		System.out.println("All Salary > 50000 : ");
		employee.stream().filter(sal->sal.salary>50000).forEach(sal->System.out.println(sal.salary));
		
		System.out.println("All Location start with 'M' : ");
		employee.stream().filter(loc->loc.empLocation.charAt(0)=='M').forEach(loc->System.out.println(loc.empLocation));
		
		System.out.println("All Designation ends with 'E' : ");
		employee.stream().filter(deg->deg.empDesignation.charAt(deg.empDesignation.length()-1)=='E').forEach(deg->System.out.println(deg.empDesignation));
	}
	
}
