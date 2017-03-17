package com.prizy.dao;

import java.util.List;

import com.prizy.pojo.Product;

public interface ProductDAO {

	public void productloader(Product product);

	public List<Product> productList();

	public List<Product> getProduct(int barcode);

}
