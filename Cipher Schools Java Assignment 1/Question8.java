class MyException extends Exception{
	void myMessage() {
		System.out.println("String value");
	}
}
class GenericMethodTest{
	public static <G> void printNumber(G... arr) {
		for(G element : arr) {
			if(element instanceof String) {
				try {
				throw new MyException();
				}catch (MyException e) {
					// TODO: handle exception
					e.myMessage();
				}
			}else {
				System.out.println(element);
			}
	    }
	}
}
public class Question8{

	public static void main(String[] args) {
		new GenericMethodTest();
		// TODO Auto-generated method stub
		GenericMethodTest.printNumber(1, "hello", 120);
	}

}
