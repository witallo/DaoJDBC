package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class Factory {
	public static SellerDAO createSellerDAO() {
		return new SellerDAOJDBC();
	}
}
