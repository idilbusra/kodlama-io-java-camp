package kolama.io.rentACar.business.abstracts;

import kolama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService { //Is kurallari yazilir
    List<Brand> getAll();
}
