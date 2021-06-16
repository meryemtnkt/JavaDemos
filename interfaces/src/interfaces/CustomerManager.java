package interfaces;

public class CustomerManager {

	//1.yol
	private ICustomerDal customerDal;

	
	//2.yol
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal =customerDal;
	}
	
	public void add() {
		//i� kodlar� buraya yaz�l�r. Dal �n i�inde ki add le ayn� de�il.
		// m��teri eklemek i�in kullan�l�r paramtre g�nderilmesi
		
		//1.yol
		customerDal.add();
		
		
	}
}
