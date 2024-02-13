package classeswithattributes;

public class Product {

    //attribute-field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    public String _kod;

    //GETTER
    public int getId(){ //Sadece READ --> Okunabilir, degistirilemez
        return id;
    }
    //SETTER
    public void setId(int id){ //Onun degerini kur, degistir demek--> Write
        this.id =id;  //this._id=id;  //--> Bu classin id'sini, parametreden ayirtmak icin _id yaptik fieldlerin isimlerini
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }
}
