package hashMapCustomer;

import java.util.HashMap;
import java.util.Scanner;

public class HashTEST {
	public static void main(String[] args) {
	HashMap<String, Customer> map = new HashMap<String, Customer>(); // (����, �� ��ü) �ؽ��� ����
	map.put("�����", new Customer(1, "010-3410-0012"));
	map.put("������", new Customer(2, "010-2356-5324"));
	map.put("�̽¿�", new Customer(3, "010-4635-2464"));

	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.print("������ �Է��ϼ��� :");
		String name = scanner.nextLine();
		if(name.equals("x")) 
			break;
		
		Customer customer = map.get(name);  // �̸��� �ش��ϴ� �� ��ü �˻�
		if(customer == null)
			System.out.println(name + "�� ���� �ƴմϴ�");
		else
			System.out.println("id: " + customer.getId() + ", ��ȭ��ȣ" + customer.getTell());
	}
	scanner.close();
	}
	
}

