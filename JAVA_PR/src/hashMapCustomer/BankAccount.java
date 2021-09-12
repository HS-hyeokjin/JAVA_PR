package hashMapCustomer;

public class BankAccount {

	int balance;
	Person owner;

	boolean deposit(int amount) {
		
		if (amount > owner.cashAmount) {
			System.out.println("입금실패입니다.");
			return false;
		}
		balance += amount;
		owner.cashAmount -= amount;
		System.out.println("입금성공입니다.");

		return true;
	}

	
}

