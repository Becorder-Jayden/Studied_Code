package chapter13;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator�� ������ Ŭ���� ����
class CompareString implements BinaryOperator<String> {
	
	// reduce() �޼��尡 ȣ��� �� �Ҹ��� �޼���, �� ���ڿ� ���̸� ��
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~~", "hello", "Good morning", "�ݰ����ϴ�^^"};
		
		// ���ٽ��� ���� �����ϴ� ���
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));
		
	// BinaryOperator�� ������ Ŭ���� ���	
	String str = Arrays.stream(greetings).reduce(new CompareString()).get();
	System.out.println(str);
	}

}
