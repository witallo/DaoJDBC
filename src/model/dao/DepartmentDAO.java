package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDAO {
	void insert(Department department);

	void update(Department department);

	void deleteByID(Integer ID);

	Department findById(Integer ID);

	List<Department> findAll();
}
