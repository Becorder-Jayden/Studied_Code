package chapter9;

// �߻� �޼��尡 ���� Ŭ������ �߻� Ŭ������ �����ؾ� �Ѵ�
public abstract class Computer {
	
	// �߻�Ŭ���� display()�� typing()�� ���� �޼��忡 ���� ������ �޶�����. �� �޼��� ������ ���� å���� ��ӹ޴� Ŭ������ �����Ѵٴ� �ǹ�
	public abstract void display(); 
	public abstract void typing(); 
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
