import java.util.Scanner;

class SavingAmount{
	int saving;
	void setter(int saving) {
		this.saving = saving;
	}
	int getter() {
		return saving;
	}
	void increment() {
		saving = saving + 1000;
	}
	void decrement() {
		saving = saving - 100;
	}
	void checkSavings() {
		if(saving>=1000) {
			System.out.println("Congratulations! You have saved a good amount.");
		}else if(saving<1000 && saving>=0) {
			System.out.println("Insufficient saving!");
		}else {
			System.out.println("You are in debt");
		}
	}
}
public class VirtualBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int saving = sc.nextInt();
		SavingAmount amount = new SavingAmount();
		amount.setter(saving);
		amount.decrement();
		System.out.println(amount.getter());
		amount.increment();
		System.out.println(amount.getter());
		amount.checkSavings();
		System.out.println("Your current saving is "+amount.getter());
	}

}
