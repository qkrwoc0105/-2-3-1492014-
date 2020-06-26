package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

public interface ProductTable extends CrudRepository<Product, Long> {
	List<Product> findById(int id);
	List<Product> findByCategory(String category);
}