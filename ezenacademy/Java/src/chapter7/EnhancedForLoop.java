package chapter7;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		// ������ �迭�� �� ��Ұ� ����, �ʱ�ȭ�� ���� ������ ���� ������ ��� �迭�� ���ۺ��� �� ��ұ��� ����
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
