package interfaces;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager =new CustomerManager(new OracleCustomerDal());
		//	customerManager.customerDal =new OracleCustomerDal();
		//2 . yolda buna ihtiyaç yok	customerManager.customerDal = new SqlServerCustomerDal();
		customerManager.add();
	}

}
