package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//konfigurasyon de�i�tiriliyor
		//customerManager.databaseManager= new SqlServerDatabaseManager();
		customerManager.databaseManager= new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
