package statickDemo;

public class ProductManager {
	public void add(Product product) {
	//productvalidator static oldugu i�in bir kere tan�mlama yeterli a�a��daki tan�mlamaya gerek yok
	//	ProductValidator productValidator =new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");

		} else {
			System.out.println("Urun bilgileri ge�ersiz");

		}
		
	}

}
