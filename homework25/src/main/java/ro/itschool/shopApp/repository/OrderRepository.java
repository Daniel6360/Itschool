package ro.itschool.shopApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.shopApp.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
