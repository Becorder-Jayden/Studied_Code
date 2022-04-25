package chapter11;

public class ClassTest {

	// throws ClassNotFoundException : forName() �޼��忡�� �߻��ϴ� ���ܸ� ó����.
	// �̸��� ��ġ�ϴ� Ŭ������ ���� ��� ClassNotFoundException �߻�
	public static void main(String[] args) throws ClassNotFoundException { 
		Person person = new Person();
		
		// Object�� getClass() �޼��� ����ϱ�
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		// ���� class ���� �����ϱ�
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}

}
