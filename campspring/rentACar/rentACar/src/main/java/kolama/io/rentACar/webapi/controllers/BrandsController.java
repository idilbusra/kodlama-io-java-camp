package kolama.io.rentACar.webapi.controllers;

import kolama.io.rentACar.business.abstracts.BrandService;
import kolama.io.rentACar.business.requests.CreateBrandRequest;
import kolama.io.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);

    }
}

//   http://localhost:8080/api/brands/getall  --> Chrome Normal
//    http://localhost:8080/api/brands/getall -->postman ile
//    localhost:8080/swagger-ui/index.html -->swagger ile