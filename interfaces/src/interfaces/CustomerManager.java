package interfaces;

public class CustomerManager {

	//1.yol
	private ICustomerDal customerDal;

	
	//2.yol
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal =customerDal;
	}
	
	public void add() {
		//iþ kodlarý buraya yazýlýr. Dal ýn içinde ki add le ayný deðil.
		// müþteri eklemek için kullanýlýr paramtre gönderilmesi
		
		//1.yol
		customerDal.add();
		
		
	}
}
