package abstractClasses;

public abstract class GameCalculator {

	//hesaplay� i�ermek ve kendi hesaplamay� yazmak zorunda
	public abstract void hesapla() ;
	
	//asla de�i�tirilmeyecek bir kurald�r.
	public final void gameOver() {
		System.out.println("Oyun bitti !!");
	}
}
