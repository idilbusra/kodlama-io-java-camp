package kolama.io.rentACar.business.abstracts;

import kolama.io.rentACar.business.requests.CreateBrandRequest;
import kolama.io.rentACar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService { //Is kurallari yazilir
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

}
