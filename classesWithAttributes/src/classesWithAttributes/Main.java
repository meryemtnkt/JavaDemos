package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product= new Product();
		product.setName("Laptop");
		product.setId(20);
		product.setDescription("Asus Lapto");
		product.setPrice(50000);
		product.setStockAmount(3);
		
		ProductManager productmanager=new ProductManager();
		productmanager.Add(product);
		
		System.out.println(product.getKod());
		
//		System.out.println(product.name);
	}

}
