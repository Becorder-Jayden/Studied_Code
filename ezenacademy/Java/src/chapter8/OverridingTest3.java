package chapter8;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		// Customer �ν��Ͻ� ����
		Customer customerLee = new Customer(10010, "�̼���");
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "�� �Դϴ�.");
		
		// VIPCustomer �ν��Ͻ� ����
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "�� �Դϴ�.");

		// VIPCustomer �ν��Ͻ��� Customer������ ��ȯ: ����޼���
		Customer vc = new VIPCustomer(10030, "������", 2000);
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�.");
	}	
}
