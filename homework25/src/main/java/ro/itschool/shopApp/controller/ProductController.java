package ro.itschool.shopApp.controller;

import org.springframework.web.bind.annotation.*;
import ro.itschool.shopApp.model.Category;
import ro.itschool.shopApp.model.Product;
import ro.itschool.shopApp.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }



    @GetMapping()
    List<Product> getProductByCategory(@RequestParam() Category category) {
        return service.getProductByCategory(category);
    }

    @PostMapping
    void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping
    void updateProduct(@RequestParam int productId, @RequestBody Product product){
        service.updateProduct(productId,product);
    }

    @DeleteMapping
    void deleteProduct(@RequestParam int productId){
        service.deleteProduct(productId);
    }
}
