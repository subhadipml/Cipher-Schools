import java.util.ArrayList;

class Employee2{
	String name, address;
	int yoj;
	double salary;
	Employee2(String name, int yoj, String address, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.yoj = yoj;
		this.address = address;
		this.salary = salary;
	}
	public String toString() {
		return name+" "+yoj+" "+address+" "+salary;
	}
}
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee2> employee = new ArrayList<Employee2>();
		employee.add(new Employee2("Robert", 1994, "64C-WallStreet", 1000));
		employee.add(new Employee2("Sam", 2000, "68D-WallStreet", 2000));
		employee.add(new Employee2("John", 1999, "28B-WallStreet", 3000));
		System.out.println("Name"+" "+"Year of joining"+" "+"Address"+" "+"Salary");
		
		employee.stream().map(emp->emp).forEach(emp->System.out.println(emp));
	}

}
