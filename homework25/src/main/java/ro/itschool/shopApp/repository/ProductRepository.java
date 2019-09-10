package ro.itschool.shopApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.shopApp.model.Category;
import ro.itschool.shopApp.model.Product;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
List<Product> findByCategory(Category category);

Product findByProductId(int id);
}

