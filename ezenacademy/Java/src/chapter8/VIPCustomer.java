package chapter8;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}

	public VIPCustomer() {
		customerGrade = "VIP";  // customerGrade: ���� Ŭ�������� ������ customerGrade�� private �����̱� ������ ���� �߻�
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ�� ");
	}

//	p.251 Override/Implement Methods ... ��ư�� ������ ���� -> override�� ����� �ۼ��߱� ����
//	@Override // �����ǵ� �޼���
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int) (price * saleRatio);
//	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public String showCustomoerInfo() {
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
//	public String showCustomerInfo() {
//		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
//	}

	public int getAgentID() {
		return agentID;
	}
}
