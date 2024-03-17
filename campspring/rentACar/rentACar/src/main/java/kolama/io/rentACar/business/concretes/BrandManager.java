package kolama.io.rentACar.business.concretes;

import kolama.io.rentACar.business.abstracts.BrandService;
import kolama.io.rentACar.business.requests.CreateBrandRequest;
import kolama.io.rentACar.business.requests.UpdateBrandRequest;
import kolama.io.rentACar.business.responses.GetAllBrandsResponse;
import kolama.io.rentACar.business.responses.GetByIdBrandResponse;
import kolama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kolama.io.rentACar.dataaccess.abstracts.BrandRepository;
import kolama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    @Autowired //-->Parametreden bir obje kullanir ve her yerde kullanir, defaulttur, yazilmasa da olur.
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand>brands = brandRepository.findAll();
     //  List<GetAllBrandsResponse> brandsResponse= new ArrayList<GetAllBrandsResponse>();

     //  for (Brand brand : brands){
     //      GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
     //      responseItem.setId(brand.getId());
     //      responseItem.setName(brand.getName());
     //      brandsResponse.add(responseItem);
     //  }--->Alttaki satirlar bu kodlarin islemini yapiyor
        List<GetAllBrandsResponse> brandsResponse=brands.stream().
                map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class))
                .toList(); //--> stream for gibi calisiyor, oncesinde brandleri tek tek gerek mapliyoruz, sonra da ceviriyoruz, collect methodu da GetAllResponselari topla, Liste cevir demek
        return brandsResponse;
    } //BrandServiceImpl da denilebiliyor
    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand=this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response= this.modelMapperService.forResponse()
                .map(brand,GetByIdBrandResponse.class);
        return response;
    }
    @Override
    public void add(CreateBrandRequest createBrandRequest) {
       // Brand brand= new Brand();
       // brand.setName(createBrandRequest.getName());  --->Asagidaki kod ile bu 2 satiri otomatik hale getirdik, yoksa tek tek yazacaktik:)
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest()
                .map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

}
