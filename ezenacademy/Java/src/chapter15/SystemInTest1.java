package chapter15;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			i = System.in.read();	// read() �޼���� �� ����Ʈ ����
			System.out.println(i);
			System.out.println((char)i);	// ���ڷ� ��ȯ�Ͽ� ���
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}