package chapter11;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// �� �ν��Ͻ� �ּ� ���� ������ ���Ͽ� ���
		System.out.println(str1 == str2);
		
		// �� �ν��Ͻ� ���ڿ� ���� ������ ���Ͽ� ���
		System.out.println(str1.equals(str2));
		
		Integer i1 = new Integer(100);		
		Integer i2 = new Integer(100);
		
		// �� �ν��Ͻ� �ּ� ���� ������ ���Ͽ� ���
		System.out.println(i1 == i2);

		// �� �ν��Ͻ� ���� ���� ������ ���Ͽ� ���
		System.out.println(i1.equals(i2));
	}
}
