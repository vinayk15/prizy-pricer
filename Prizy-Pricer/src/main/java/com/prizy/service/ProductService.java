
package com.prizy.service;

import java.util.List;

import com.prizy.pojo.Product;

public interface ProductService {
	
	

	public void productloader(Product product);
	public List<Product> productList();

	public List<Product> getProduct(int barcode);

}
