package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department (1,"Books");
		System.out.println(obj.toString());
		
		Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),100.0,obj);
		
		System.out.println(seller.toString());
	}

}
