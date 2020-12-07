package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class SellerDAOJDBC implements SellerDAO {

	private Connection conn;

	public SellerDAOJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller seller) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller seller) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByID(Integer ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer ID) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName" + " FROM seller INNER JOIN department"
							+ " ON seller.DepartmentId = department.Id" + " WHERE seller.Id = ?");
			st.setInt(1, ID);
			rs = st.executeQuery();
			if (rs.next()) {
				Department dep = instantiateDepartment(rs);
				Seller seller = instantiateSeller(rs,dep);
				return seller;
			} else {
				return null;
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}

	}

	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException{
		Seller seller = new Seller();
		seller.setID(rs.getInt("ID"));
		seller.setName(rs.getString("name"));
		seller.setEmail(rs.getString("email"));
		seller.setBaseSalary(rs.getDouble("basesalary"));
		seller.setBirthdate(rs.getDate("birthdate"));
		seller.setDepartment(dep);
		
		return seller;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setID(rs.getInt("departmentId"));
		dep.setName(rs.getString("depName"));
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
