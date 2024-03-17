package kolama.io.rentACar.webapi.controllers;

import kolama.io.rentACar.business.abstracts.BrandService;
import kolama.io.rentACar.business.requests.CreateBrandRequest;
import kolama.io.rentACar.business.requests.UpdateBrandRequest;
import kolama.io.rentACar.business.responses.GetAllBrandsResponse;
import kolama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return this.brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id){
        return brandService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }
}

//   http://localhost:8080/api/brands/getall  --> Chrome Normal
//    http://localhost:8080/api/brands/getall -->postman ile
//    localhost:8080/swagger-ui/index.html -->swagger ile