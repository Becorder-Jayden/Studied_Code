package chapter7;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		for(int i =0; i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==== bookArray2 ====");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//	bookArray1의 변경사항이 bookArray2에도 반영됨
		//	배열에 저장된 값은 인스턴스 자체가 아니고 인스턴스 주소 값이기 때문
		// 	주소 값만 복사하는 것을 얕은 복사(shallow copy)라고 한다
	}

}
