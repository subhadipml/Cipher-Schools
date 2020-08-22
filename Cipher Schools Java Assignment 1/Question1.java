
interface Calculator1{
	int add(int a, int b);
}
interface Calculator2{
	int difference(int a, int b);
}
interface Calculator3{
	int product(int a, int b);
}
interface Calculator4{
	int safeDivision(int a, int b);
}
public class Question1 {
	public static void main(String[] args) {
		
		
		Calculator1 c1=(int a, int b)->(a+b);
		System.out.println(c1.add(10, 20));
		
		Calculator2 c2=(int a, int b)->(a-b);
		System.out.println(c2.difference(10, 20));
		
		Calculator3 c3=(int a, int b)->(a*b);
		System.out.println(c3.product(10, 20));
		
		Calculator4 c4=(int a, int b)->(a/b);
		System.out.println(c4.safeDivision(10, 20));
	}
}
