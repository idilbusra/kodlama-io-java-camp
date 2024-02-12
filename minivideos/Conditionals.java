public class Conditionals {
    public static void main(String[] args) {
        int sayi= 20;
        if (sayi<20){
            System.out.println("Sayi 20'den kucuktur");
        }

        if (sayi<15){
            System.out.println("Sayi 20'den kucuktur");
        } //Yukaridaki if'le ayri sartlardir

        if (sayi<20){
            System.out.println("Sayi 20'den kucuktur");
        }else if (sayi==20){
            System.out.println("Sayi 20'den kucuk degildir");
        }// Ya if ya da else calisir --> defensive programing - programda acik birakmamak
    }
}
