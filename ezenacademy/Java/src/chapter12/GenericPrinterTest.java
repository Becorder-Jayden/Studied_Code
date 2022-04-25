package chapter12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());  // Powder������ GenericPrinter Ŭ���� ����
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
	
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());  // Plastic������ GenericPrinter Ŭ���� ����
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
	}
}
