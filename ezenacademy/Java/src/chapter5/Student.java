package chapter5;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	
	//	�Լ� ��ȯ���� ����ξ� ������ �߻��ϴ� ���� �����ϱ� ���� ����ִٶ�� ���� void�� ���
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	//	private ������ studentName�� ������ ���� �������� public get() �޼���
	public String getStudentName() {
		return studentName;
	}

	// private ������ studentName�� ������ ���� �����ϴ� public set() �޼���
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();  // Student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}