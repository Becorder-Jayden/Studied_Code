package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String args[]) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'G'};
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
