//package kolama.io.rentACar.dataaccess.concretes;
//
//import kolama.io.rentACar.dataaccess.abstracts.BrandRepository;
//import kolama.io.rentACar.entities.concretes.Brand;
//import java.util.ArrayList;
//import java.util.List;
//
//public class InMemoryBrandRepository implements BrandRepository {
//    List<Brand>brands;
//
//    public InMemoryBrandRepository() {
//        brands=new ArrayList<Brand>();
//        brands.add(new Brand(1,"Bmw"));
//        brands.add(new Brand(2,"Mercedes"));
//        brands.add(new Brand(3,"Audi"));
//        brands.add(new Brand(4,"Fiat"));
//        brands.add(new Brand(5,"Renault"));
//    }
//    @Override
//    public List<Brand> getAll() {
//        return null;
//    }
//}
//-->JPA REPOSITORYDEN EXTENDS ETTIKTEN SONRA BU CLASSA GEREK KALMADI,CUNKU JPADAN OTOMATIK OLARAK find save vs geliyor
