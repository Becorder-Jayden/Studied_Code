package chapter8;

public class OverridingTest2 {

//	������ Ŭ���� �� ��ȯ�� �޼��� ������
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "������", 2000);  // ����Ŭ���� newCustomer�� ������ ���� ���� Ŭ���� Customer ���·� ���� ����
		vc.bonusPoint = 1000;	
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000)+ "�� �Դϴ�.");
		// ���� Ŭ���� VIPCustomer�� calcPrice() �޼��尡 ȣ��� : ����޼���
	}
	

}
