package chapter12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{
	@Override  // �������� ����
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
}

public class ComparatorTest {
	
	public static void main(String[] args) {
		
		// TreeSet �������� �Ű������� ���� ����� ����
		Set<String> set = new TreeSet<String>(new Mycompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	}

}
