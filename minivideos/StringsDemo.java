public class StringsDemo {
    public static void main(String[] args) {

        String mesaj = "  Bugun hava cok guzel  ";

        System.out.println(mesaj);

//        System.out.println("Eleman sayisi : "+ mesaj.length());
//        System.out.println("5. eleman : "+ mesaj.charAt(4));//4. index=5.eleman oluyor-indexler sifirdan baslar
//        System.out.println(mesaj.concat(" Yasasin!"));
//        System.out.println(mesaj); //Yasasin yazmaz cunku biz atama yapmadik
//        System.out.println(mesaj.startsWith("B")); //startsWith() methodu true- false dondurur
//        System.out.println(mesaj.endsWith("."));//endsWith () methodu da ture-false dondurur
//        char[] karakterler = new char[5];
//        mesaj.getChars(0,5, karakterler,0); //Bu method Stringteki yazani karakterlere ayiriyor, onlari bir liste haline getiriyor ama hemen ustte listeyi tanimlaman lazim, () ici siralamasi su sekildedir, (baslangic, bitis,listenin adi, kacincisindan itibaren alinacagi)==> Bitis indexindeki karakter dahil degildir, Dikkat!!
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf('a'));//indexOf() methodu karakterin indexini veriyor
//        System.out.println(mesaj.indexOf("av"));//Burada da av kelimeinin nereden itibaren basladigi indexi yazdirir
//        System.out.println(mesaj.lastIndexOf("av"));// lastIndexOf() aramaya sagdan baslar yani en sondan, ilk gordugu indexi alir

        String yeniMesaj=mesaj.replace(' ', '-'); //replace() degistirme methodudur, parantez icinde ilk yazdigimizi ikinci yazdigimiz ile degistirir.
        System.out.println(yeniMesaj.replace("ava", "*")); //Tek karakter degil, kelime olarak de degistirilebilir
        System.out.println(mesaj.substring(2)); //substring() methodu paranteze yazdigin sayidan itibaren boluyor, oradan baslayip sonuna kadar oln her seyi aliyor.
        System.out.println(mesaj.substring(2,4));//Buradaki parametre de 2den baslar, 4 e kadar yazdirir demektir, aralik belirtir, 4u dahil ETMEZ!

        for (String kelime : mesaj.split(" ")) { //split() methodu bol demektir, bolmek ani, parantez icine yazdigindan boler, burada bosluk var bu sebeple bosluklardan bolecek
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());// toLowerCase() methodu mesajdaki tum harfleri kucultecek
        System.out.println(mesaj.toUpperCase());// toUpperCase() methodu mesajdaki tum harfleri buyultecek
        System.out.println(mesaj.trim());//trim() methodu bastaki ve sondaki bosluklari siler


    }
}
