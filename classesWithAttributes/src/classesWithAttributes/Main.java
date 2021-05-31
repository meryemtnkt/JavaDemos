package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product= new Product();
		product.name="Laptop";
		product.id=1;
		product.description="Asus LAptop";
		product.price=5000;
		
		ProductManager productmanager=new ProductManager();
		productmanager.Add(product);
		
//		System.out.println(product.name);
	}

}
