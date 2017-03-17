package com.prizy;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.util.Assert;

import com.prizy.dao.ProductDAO;
import com.prizy.pojo.Product;
import com.prizy.service.impl.ProductServiceIMPL;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest {

	Product p1, p2, p3, p4, p5, p6, p7;

	List<Product> plist = new ArrayList<Product>();

	@InjectMocks
	ProductServiceIMPL productServiceImpl;

	@Mock
	ProductDAO productDao;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		p1 = new Product(1, "store1", 123, "TestDescription", 100, "Test");
		p2 = new Product(2, "store2", 123, "TestDescription", 130, "Test");
		p3 = new Product(3, "store3", 123, "TestDescription", 150, "Test");
		p4 = new Product(4, "store4", 123, "TestDescription", 120, "Test");
		p5 = new Product(5, "store5", 123, "TestDescription", 135, "Test");
		p6 = new Product(6, "store6", 123, "TestDescription", 145, "Test");
		p7 = new Product(7, "store7", 123, "TestDescription", 160, "Test");

		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
		plist.add(p7);

	}

	@Test
	public void test() {

		System.out.println("RUNNING THE UNIT TEST");
		plist = getProduct(123);

		// when(productDao.getProduct(123)).thenReturn(plist);

		// Assert minimum Value
		Assert.isTrue(100 == plist.get(0).getPrice());

		// Assert Max price Value
		//assertTrue(160 == plist.get(plist.size() - 1).getPrice());

		System.out.println("********DONE*********");

	}

	private List<Product> getProduct(int barcode) {

		Collections.sort(plist);
		return plist;

	}

}
