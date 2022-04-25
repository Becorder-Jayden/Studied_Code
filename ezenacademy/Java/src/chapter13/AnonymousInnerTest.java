package chapter13;


class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		// MyRunnable Ŭ���� �̸��� ���� Ŭ������ �ٷ� �����ϴ� ���
		return new Runnable() {	// �͸� ���� Ŭ����. Runnable �������̽� ����
			@Override
			public void run() {
				// ���� �߻�
//				num = 200;
//				i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};
}

public class AnonymousInnerTest {

	// �������̽��� �߻� Ŭ������ ������ �����ϰ� Ŭ������ ������ �����ϴ� ��� 
	public static void main(String[] args) {  // �͸� ���� Ŭ������ ������ ����
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}

}
