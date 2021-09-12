package hashMapCustomer;

public class Customer {
	private int id;
	private String tell;
	
	public Customer(int id, String tell) { 
	this.id = id; 
	this.tell = tell;
	}

	public int getId() {
		return id;
	}
	
	public String getTell() { 
		return tell;
	}
}