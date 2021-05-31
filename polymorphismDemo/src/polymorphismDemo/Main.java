package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(),new ConsoleLogger()};
//		for (BaseLogger logger:loggers) {
//			logger.Log(" log mesajý");
//		}
		
		
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
