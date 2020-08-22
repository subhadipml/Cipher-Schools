class Circle{
	private double radius = 1.0;
	private String color = "red";
	Circle(){
		
	}
	Circle(double radius){
		this.radius =radius;
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		return 3.14*Math.pow(getRadius(), 2);
	}
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
