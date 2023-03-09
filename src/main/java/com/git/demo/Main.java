package com.git.demo;

import java.util.Arrays;
import java.util.List;

public class Main {

	public void getMessage(String message) {
		System.out.println("Message : " + message);
		if (message.equals("Thiru")) {
			System.out.println("Message is : " + message);
		}

	}

	public void addedmthod1() {
		System.out.println("added a method from another developer: ");
	}

	public String newMessage(String message) {
		return "Welcome to git demo project..";
	}

	public void m1() {
		System.out.println("added a method for pulling the code.. ");
	}

	public static void main(String[] args) {
		System.out.println("inside main method...");
		List<Product> productList = Arrays.asList(new Product(101, "Laptop", "Lenovo"), new Product(102, "Pen", "ABC"),
				new Product(103, "TV", "Samsung"), new Product(104, "Pencil", "Apsara"));

		System.out.println(productList);

	}

}
