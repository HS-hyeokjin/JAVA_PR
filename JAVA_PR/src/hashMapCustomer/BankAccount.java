package hashMapCustomer;

public class BankAccount {

	int balance;
	Person owner;

	boolean deposit(int amount) {
		
		if (amount > owner.cashAmount) {
			System.out.println("�Աݽ����Դϴ�.");
			return false;
		}
		balance += amount;
		owner.cashAmount -= amount;
		System.out.println("�Աݼ����Դϴ�.");

		return true;
	}

	
}

