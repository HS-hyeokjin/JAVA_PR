package hashMapCustomer;

import java.util.HashMap;
import java.util.Scanner;

public class HashTEST {
	public static void main(String[] args) {
	HashMap<String, Customer> map = new HashMap<String, Customer>(); // (고객명, 고객 객체) 해쉬맵 생성
	map.put("손흥민", new Customer(1, "010-3410-0012"));
	map.put("박지성", new Customer(2, "010-2356-5324"));
	map.put("이승우", new Customer(3, "010-4635-2464"));

	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.print("고객명을 입력하세요 :");
		String name = scanner.nextLine();
		if(name.equals("x")) 
			break;
		
		Customer customer = map.get(name);  // 이름에 해당하는 고객 객체 검색
		if(customer == null)
			System.out.println(name + "은 고객이 아닙니다");
		else
			System.out.println("id: " + customer.getId() + ", 전화번호" + customer.getTell());
	}
	scanner.close();
	}
	
}

