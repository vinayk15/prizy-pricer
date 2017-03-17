package com.prizy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prizy.pojo.Product;
import com.prizy.service.ProductService;

@Controller
public class MainController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/productloader")
	public String welcome(Model model) {
		model.addAttribute("product", new Product());
		return "product";

	}

	@RequestMapping(value = "/saveproduct")
	public String productLoadder(Product product) {
		productService.productloader(product);

		return "sucessProduct";
	}

	@RequestMapping(value = "/admin/productList")
	public String productList(Model model) {

		model.addAttribute("listproduct", productService.productList());

		return "listProduct";
	}

	@RequestMapping("admin/view/{barcode}")
	public String getProduct(@PathVariable("barcode") int barcode, Model model) {
		System.out.println(barcode);

		List<Product> products = productService.getProduct(barcode);
		model.addAttribute("listproduct", products);

		model.addAttribute("barcode", barcode);

		model.addAttribute("desc", products.get(0).getDescription());

		model.addAttribute("number", products.size());

		model.addAttribute("minimum", products.get(0).getPrice());

		model.addAttribute("maximum", products.get(products.size() - 1).getPrice());

		double avgprice = getaverage(products);
		model.addAttribute("averageProduct", avgprice);

		// Ideal Price Logic
		if (products.size() > 4) {
			List<Product> list = products.subList(2, products.size() - 2);

			double idealavg = getaverage(list);
			double idealprice = (idealavg * 20) / 100 + idealavg;
			model.addAttribute("idealprice", idealprice);

			System.out.println(products);

			return "getProduct";
		} else {
			model.addAttribute("error",
					"We need more than 4 products to determine the Ideal Price for the given barcode");
			return "getProduct";

		}
	}

	public double getaverage(List<Product> products) {
		double average;
		int sum = 0;
		for (int i = 0; i < products.size(); i++) {
			sum += products.get(i).getPrice();
		}
		average = sum / products.size();

		return average;

	}

}
