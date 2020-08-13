import java.util.Scanner;

public class ASCIIStringGame {
	
	void X(String a, String b) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		switch(key) {
			case 1:
				String s = a.concat(b);
				int sum=0;
				for(int i=0; i<s.length(); i++) {
					sum+=(int)s.charAt(i);
				}
				System.out.println(sum);
				break;
			case 2:
				System.out.println(a+b);
				break;
			case 3:
				int sum2 = Integer.valueOf(a);
				int sum1=0;
				for(int i=0; i<b.length(); i++) {
					sum1+=(int)b.charAt(i);
				}
				System.out.println(sum1+sum2);
				break;
			default:
				System.out.println("Invalid Operation!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.nextLine();
		b = sc.nextLine();
		ASCIIStringGame game = new ASCIIStringGame();
		game.X(a, b);
	}

}
