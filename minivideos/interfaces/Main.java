package interfaces;

public class Main {
    public static void main(String[] args) {

        ICustomerDal customerDal = new OracleCustomerDal(); //Interfaceler kendinden newlenemezler
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

        customerManager.add();
    }
}
