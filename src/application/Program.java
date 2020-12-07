package application;

import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDAO sellerDAO = model.dao.Factory.createSellerDAO();
		Seller seller = sellerDAO.findById(1);
		System.out.println(seller);
	}

}
