package com.prizy.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prizy.dao.ProductDAO;
import com.prizy.pojo.Product;

@Repository
public class ProductDAOIMPL implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory = null;
	static Session session = null;

	public Session getSession() {

		try {
			session = getSessionFactory().getCurrentSession();

		} catch (Exception e) {
			session = getSessionFactory().openSession();
		}

		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void productloader(Product product) {
		getSession().save(product);
	}

	public List<Product> productList() {
		Criteria c = getSession().createCriteria(Product.class);
		return c.list();
	}

	public List<Product> getProduct(int barcode) {

		String sql = "FROM Product where barcode=barcode";
		Criteria c = getSession().createCriteria(Product.class); //List all Products
		
		c.add(Restrictions.eq("barcode", barcode)); //where clause to filter based on barcode

		return c.list();
	}

}
