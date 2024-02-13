public class miniProjeAsalSayi {
    public static void main(String[] args) {

        int number = 25;
        int remainder = number % 2; //Matematikteki mod gibi anlami vardir, 22ye bolumden kalani % ile buluruz

        //System.out.println(remainder);

        if(number==1){
            System.out.println("Sayi asal degildir");
        }

        if(number<1){
            System.out.println("Gecersiz sayi");
        }

        boolean isPrime= true;//Oncelikle asal kabul etti
        for (int i =2; i<number; i++){
            if (number%2==0){ //2den 24e kadar olan herhangi bir sayi boluyorsa,
                isPrime=false; //artik asal degildir.
            }
        }

        if (isPrime){
            System.out.println("Sayi asaldir");
        }else{
            System.out.println("Sayi asal degildir");
        }

    }

}
