package classes;

public class Main {
    public static void main(String[] args) { //Class'lar reference typetir.

        CustomerManager customerManager = new CustomerManager(); //Bir Class'i kullanabilmek icin new'lemek lazim
        CustomerManager customerManager2= new CustomerManager(); //customerManager ile customerManager2'nin Heap memory'deki reference'leri farklidir, ayni classtan olusmalarina ragmen variable nameleri farklidir, objeler farklidir, variable degerleri stack memoryde tutulur.
        customerManager=customerManager2; //==> Bunu yapinca iki objenin de heap memorydeki referanceleri ayni olmus oldu, cunku assign ettik. 6.satirdaki constructor otomatik olarak bosa dustu, bir sure sonra kullanilmayan constructor Garbage Collector ile silinecektir!

        //6. satir yerine --> CustomerManager customerManager; yazilabilir ;)

        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //VALUE TYPE - EXAMPLE: -->Burada deger tipleriyle islem yapildigi icin atamalar Stack memoryde gerceklesir
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2); //10

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2=sayilar1; //Bununla sayilar1'in reference adresini hem sayilar2'ye hem de sayilar1'e aktarimis oldu, sayilar2'nin reference adresi bosta kaldi ve silinecek Garbage collector ile
        sayilar1[0]=10;
        System.out.println(sayilar2[0]); //10 ==> DIZILER REFERANS TIPTIR!


    }
}
