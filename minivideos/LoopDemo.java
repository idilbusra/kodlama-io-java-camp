public class LoopDemo {
    public static void main(String[] args) {
        //for
        for (int i=2; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Dongu bitti");

        //While
        int i= 2;
        while (i<10){
            System.out.println(i);
            i+=2; //Bunu yazma sebebimiz infinitive loop--> Sonsuz donguyu engellemek, yoksa 1<10 bu sebeple hep ture olur
        }

        System.out.println("While dongusu bitti");

        //Do-While

        int j = i;
        do { //While'den farki: Sart uymasa bile 1 kez calistirilir
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("Do while dongusu bitti");



    }
}
