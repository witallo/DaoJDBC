package application;

import java.util.List;

import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDAO sellerDAO = model.dao.Factory.createSellerDAO();
		System.out.println("Seller #1 ------- FindByID");
		Seller seller = sellerDAO.findById(1);
		System.out.println(seller);
		
		System.out.println("Seller #2 ------- FindByDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for(Seller obj : list){
			System.out.println(obj.toString());
		}
		System.out.println("Seller #3 ------- FindAll");
		list = sellerDAO.findAll();
		for(Seller obj : list){
			System.out.println(obj.toString());
		}
	}

}
