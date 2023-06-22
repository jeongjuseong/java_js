package day17.object;

import java.util.Objects;

import lombok.Data;

public class EqualsEx {

	public static void main(String[] args) {
		Customer list[] = {
				new Customer("홍", "010-1234-5667"),
				new Customer("임", "010-1224-5637"),
				new Customer("유", "010-1114-5117"),
		};
		Customer customer = new Customer("홍", "010-1234-5678");
		
		//equals()가 오버라이딩 안됐을때 고객이 명단에 있는지 조회
		for(Customer tmp : list) {
			if(tmp.equals(customer)) {
				System.out.println("ok");
				return;
			}
		}
		System.out.println("fail");
		
	}

}
@Data
class Customer{
	private String id;
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	
	}
	
}