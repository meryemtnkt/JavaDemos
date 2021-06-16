package statickDemo;

public class ProductValidator {
	
	static {
		System.out.println("Yapýcý static blok çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
