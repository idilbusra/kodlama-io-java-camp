package abstractclasses;

public abstract class GameCalculator { //abstract class lar asla new lenmez
    public abstract void hesapla(); //Kim implement edecekse override etmek zorunda, kendi degerini yazmasi gerekiyor mutlaka
    public final void gameOver(){ //Body degistirilemez, ayni sekilde oldugu gibi kullanacak
        System.out.println("Oyun bitti");
    }
}
