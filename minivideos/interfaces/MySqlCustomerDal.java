package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{ //extends de eklenecekse implements oncesinde yazilir syntaxde
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
