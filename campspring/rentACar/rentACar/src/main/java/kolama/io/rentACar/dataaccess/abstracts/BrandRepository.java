package kolama.io.rentACar.dataaccess.abstracts;

import kolama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>{
}
