import java.util.Scanner;

class Complex {
    int real, imaginary;
    Complex() { 
    }
    Complex(int tempReal, int tempImaginary) { 
        real = tempReal; 
        imaginary = tempImaginary; 
    }
    
    Complex addComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp; 
    } 
    
    Complex subComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp; 
    } 
    
    Complex proComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real * C2.real - C1.imaginary * C2.imaginary;
        temp.imaginary = C1.real*C2.imaginary + C1.imaginary*C2.real;
        return temp; 
    } 
} 
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Real part 1 : ");
		int r1 = sc.nextInt();
		System.out.println("Imaginary part 1 : ");
		int i1 = sc.nextInt();
		System.out.println("Real part 2 : ");
		int r2 = sc.nextInt();
		System.out.println("Imaginary part 2 : ");
		int i2 = sc.nextInt();
		
		
		Complex C1 = new Complex(r1, i1);
		Complex C2 = new Complex(r2, i2);
		
		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		System.out.println("Sum of complex number : "+ C3.real + " + "+ C3.imaginary+"i");
		
		
		C3 = C3.subComp(C1, C2);
		System.out.println("Substract of complex number : "+ C3.real + " + "+ C3.imaginary+"i");
		
		
		C3 = C3.proComp(C1, C2);
		System.out.println("Product of complex number : "+ C3.real + " + "+ C3.imaginary+"i");
		sc.close();

	}

}
