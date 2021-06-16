package statickDemo;

public class ProductManager {
	public void add(Product product) {
	//productvalidator static oldugu için bir kere tanýmlama yeterli aþaðýdaki tanýmlamaya gerek yok
	//	ProductValidator productValidator =new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");

		} else {
			System.out.println("Urun bilgileri geçersiz");

		}
		
	}

}
