package overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(),new OgretmenKrediManager()};

        for (BaseKrediManager krediManager : krediManagers){
            krediManager.hesapla(krediManager.hesapla(1000));
        }
    }
}
