package abstractClasses;

public abstract class GameCalculator {

	//hesaplayı içermek ve kendi hesaplamayı yazmak zorunda
	public abstract void hesapla() ;
	
	//asla değiştirilmeyecek bir kuraldır.
	public final void gameOver() {
		System.out.println("Oyun bitti !!");
	}
}
