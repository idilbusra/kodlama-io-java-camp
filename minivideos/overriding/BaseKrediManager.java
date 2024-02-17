package overriding;

public class BaseKrediManager {
    public double hesapla(double tutar){ //Override edilmesini istemiyorsan final yazmalisin
        return tutar * 1.18;
    }
}
