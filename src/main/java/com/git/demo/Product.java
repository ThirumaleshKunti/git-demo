package com.git.demo;

public class Product {

	private int id;
	private String name;
	private String manufacturedBy;

	public Product(int id, String name, String manufacturedBy) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturedBy = manufacturedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturedBy=" + manufacturedBy + "]";
	}

}
