package javademos;

public class MiniProjeAsalsayi {

	public static void main(String[] args) {

		int number = 12;
		int remainder=number %2 ;
		boolean isPrime=true;
		if(number==1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		if (number<1) {
			System.out.println("Say� ge�ersiz");
			return;
		}
		for (int i=2 ; i<number;i++) {
			if (number % 2 == 0) {
				isPrime=false;
			}
		}
		if(isPrime) { //isPrime == true
			System.out.println("Say� asald�r.");
		}
		else {
			System.out.println("Say� asal de�ildir.");
		}
	}

}
