package kolama.io.rentACar.dataaccess.abstracts;

import kolama.io.rentACar.entities.concretes.Brand;
import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
