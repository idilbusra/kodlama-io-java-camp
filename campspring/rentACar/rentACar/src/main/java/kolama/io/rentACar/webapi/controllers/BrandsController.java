package kolama.io.rentACar.webapi.controllers;

import kolama.io.rentACar.business.abstracts.BrandService;
import kolama.io.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}

//   http://localhost:8080/api/brands/getall  --> Chrome Normal
//    http://localhost:8080/api/brands/getall -->postman ile
//    localhost:8080/swagger-ui/index.html -->swagger ile