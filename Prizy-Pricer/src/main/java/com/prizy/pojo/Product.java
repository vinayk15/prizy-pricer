package com.prizy.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements Comparable<Product> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String store;
	int barcode;
	String description;
	double price;
	String notes;

	public Product() {

	}

	public Product(int id, String store, int barcode, String description, double price, String notes) {

		this.id = id;
		this.store = store;
		this.barcode = barcode;
		this.description = description;
		this.price = price;
		this.notes = notes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", store=" + store + ", barcode=" + barcode + ", description=" + description
				+ ", price=" + price + ", notes=" + notes + "]";
	}

	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if (this.price == o.price)
			return 0;
		if (this.price > o.price)
			return 1;
		else
			return -1;

	}

}
