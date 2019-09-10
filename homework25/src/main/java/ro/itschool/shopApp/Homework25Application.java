package ro.itschool.shopApp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.itschool.shopApp.model.Category;
import ro.itschool.shopApp.model.Product;
import ro.itschool.shopApp.repository.ProductRepository;

import java.util.List;

@SpringBootApplication
public class Homework25Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework25Application.class, args);
	}



}
