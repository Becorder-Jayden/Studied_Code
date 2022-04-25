package chapter12;

import java.util.ArrayList;

public class MemberArrayList {
	
	// ArrayList ����
	private ArrayList<Member> arrayList;
	
	//Member������ ������ ArrayList ����
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// Member������ ������ ArrayList ����
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// �ش� ���̵� ���� ȸ���� ArrayList���� ã�� ����
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			// get() �ż���� ȸ���� ���������� ������
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			// ȸ�� ���̵� �Ű������� ��ġ�ϸ� �ش� ȸ���� ����
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		// �ݺ����� ���� ������ �ش� ���̵� ã�� ���� ���
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��ü ȸ���� ����ϴ� �޼��� 
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
