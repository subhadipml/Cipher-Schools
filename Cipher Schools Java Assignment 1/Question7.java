class Triangle{
	double area(double a, double b, double c) {
		double p = (a+b+c)/2;       
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Triangle().area(5, 7, 8));
	}

}
