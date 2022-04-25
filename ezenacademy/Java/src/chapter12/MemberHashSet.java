package chapter12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();  // Iterator�� Ȱ���� ��ȸ��
		
		while(ir.hasNext()) {
			Member member = ir.next();  // ȸ���� �ϳ��� ������
			int tempId = member.getMemberId();  // ���̵� ��
			if(tempId == memberId) {  // ���� ���̵��� ���
				hashSet.remove(member);  // ȸ�� ����
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
