package chapter8;

// ������: �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��

// ���� Ŭ���� Animal, ���� Ŭ���� Human, Tiger, Eagle ����
class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) { 
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());		
	}

	// �Ű������� �ڷ����� ���� Ŭ����(Animal)
	public void moveAnimal(Animal animal) {
		animal.move();
		// �����ǵ� �޼��尡 ȣ���
	}
}