package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";
				
//		setStudentName() �޼��带 Ȱ���� private ������ ������ ����		
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}

}
