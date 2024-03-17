package kolama.io.rentACar.business.abstracts;

import kolama.io.rentACar.business.requests.CreateBrandRequest;
import kolama.io.rentACar.business.requests.UpdateBrandRequest;
import kolama.io.rentACar.business.responses.GetAllBrandsResponse;
import kolama.io.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService { //Is kurallari yazilir
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);

}
