package polymorphismdemo;

public class CustomerManager {
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger= baseLogger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        this.baseLogger.log("Log mesaji");
    }
}
