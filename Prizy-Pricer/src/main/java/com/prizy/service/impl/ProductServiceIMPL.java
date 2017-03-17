package com.prizy.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prizy.dao.ProductDAO;
import com.prizy.pojo.Product;
import com.prizy.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	public void productloader(Product product) {
		// TODO Auto-generated method stub
		productDAO.productloader(product);

	}

	public List<Product> productList() {
		// TODO Auto-generated method stub
		return productDAO.productList();
	}

	public List<Product> getProduct(int barcode) {
		// TODO Auto-generated method stub
		List<Product> plist = productDAO.getProduct(barcode);
		Collections.sort(plist);
		return plist;

	}

}
