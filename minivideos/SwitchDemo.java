public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
            case 'D':
                System.out.println("Fena degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldiniz");
                break;
            default: //Kisi nelli harfler disinda bir sey girerse diye yaziyoruz
                System.out.println("Gecersiz not girdiniz");
        }
    }

}
