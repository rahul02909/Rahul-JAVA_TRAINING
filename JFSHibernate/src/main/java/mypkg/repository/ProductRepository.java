package mypkg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import mypkg.entity.Product;


@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product, Integer> {

	 Product findByName(String name);
	
	Product findByPrice(double price);
	Product findByQuantity(int Quantity);
}