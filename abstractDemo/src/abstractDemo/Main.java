package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//konfigurasyon değiştiriliyor
		//customerManager.databaseManager= new SqlServerDatabaseManager();
		customerManager.databaseManager= new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
