package chapter9;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void Main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		cons.NUM2 = 200;
		// ���� �̸��� ��ҹ��ڸ� �����ϱ� ������ �� ������ �ٸ� �����̴�.
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
