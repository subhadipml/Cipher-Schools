import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	void display() {
		System.out.println(width+" "+height);
	}
}
class RectangleArea extends Rectangle{
	void readInput() {
		Scanner sc = new Scanner(System.in);
		width = sc.nextInt();
		height = sc.nextInt();
		sc.close();
	}
	void display() {
		System.out.println(width*height);
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea ra = new RectangleArea();
		ra.readInput();
		ra.display();
	}

}
