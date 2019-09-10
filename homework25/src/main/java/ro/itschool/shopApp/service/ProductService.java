package ro.itschool.shopApp.service;

import net.bytebuddy.implementation.bytecode.Throw;
import org.hibernate.boot.jaxb.hbm.internal.CacheAccessTypeConverter;
import org.springframework.stereotype.Service;
import ro.itschool.shopApp.model.Category;
import ro.itschool.shopApp.model.Product;
import ro.itschool.shopApp.repository.ProductRepository;

import javax.validation.ValidationException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getProductByCategory(Category category) {
        return repository.findByCategory(category);
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public void updateProduct(int productId, Product product) {
        Product oldProduct = repository.findByProductId(productId);
        if (oldProduct.getName().equals(product.getName())) {
            product.setStock(product.getStock() + oldProduct.getStock());
        } else{
            repository.delete(oldProduct);
            repository.save(product);
        }
    }

    public void deleteProduct(int productId){
        Product product=repository.findByProductId(productId);

        if(product.getStock()>0){
            throw new ValidationException("Still has stock");
        }
        else {
            repository.delete(product);
        }
    }
}
