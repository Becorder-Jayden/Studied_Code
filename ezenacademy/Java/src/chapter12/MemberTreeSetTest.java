package chapter12;


public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}

// ���� �� ���� �߻�
// Exception in thread "main" java.lang.ClassCastException: class chapter12.Member cannot be cast to class java.lang.Comparable (chapter12.Member is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
// Member Ŭ������ Comparable �������̽��� �������� �ʾҴٴ� �ǹ�

// ������ ���� �ܰ� ���� ��