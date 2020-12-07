package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDAO {
	void insert(Seller seller);

	void update(Seller seller);

	void deleteByID(Integer ID);

	Seller findById(Integer ID);

	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
