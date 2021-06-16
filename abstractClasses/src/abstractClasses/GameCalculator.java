package abstractClasses;

public abstract class GameCalculator {

	//hesaplayý içermek ve kendi hesaplamayý yazmak zorunda
	public abstract void hesapla() ;
	
	//asla deðiþtirilmeyecek bir kuraldýr.
	public final void gameOver() {
		System.out.println("Oyun bitti !!");
	}
}
