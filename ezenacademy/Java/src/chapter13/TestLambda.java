package chapter13;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		
		// �޼����� �Ű������� ���ٽ��� ������ ���� ����
		showMyString(lambdaStr);

		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	// �Ű������� �������̽� ������ ����
	public static void showMyString(PrintString p) {
		p.showString("hello labmda_2");
	}

	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
	
}
