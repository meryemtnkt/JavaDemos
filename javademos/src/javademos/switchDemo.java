package javademos;

public class switchDemo {

	public static void main(String[] args) {

		char grade ='A';
		
		switch(grade) {
			case 'A' :
				System.out.println("M�kemmel ge�tiniz");
				break;
				
			case 'B' :
				System.out.println("�ok g�zel : ge�tiniz");
				break;
				
			case 'C' :
				System.out.println("�yi :  ge�tiniz");
				break;
				
			case 'D' :
				System.out.println("Fena de�il :  ge�tiniz");
				break;
				
			case 'F' :
				System.out.println("Malesef kald�n�z");
				break;
				
			default:
				System.out.println("Ge�ersiz de�er girdiniz");
				
		}
	}

}
