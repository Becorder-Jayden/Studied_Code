package chapter6;

public class TakeTrans {
	public static void main(String[] args) {
//		Student.java ���Ͽ��� public Student ���� ����(�ʱ�ȭ) ���ױ� ������ ���� �߻�
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2ȣ��");
		studentTomas.takeSubway(subwayGreen);
		studentJames.showInfo();
		studentTomas.showInfo();
	}
}
