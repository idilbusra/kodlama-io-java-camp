package kolama.io.rentACar.business.concretes;

import kolama.io.rentACar.business.abstracts.BrandService;
import kolama.io.rentACar.dataaccess.abstracts.BrandRepository;
import kolama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    } //BrandServiceImpl da denilebiliyor

}
