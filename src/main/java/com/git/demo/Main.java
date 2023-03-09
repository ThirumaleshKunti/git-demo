package com.git.demo;

public class Main {

	public void getMessage(String message) {
		System.out.println("Message : " + message);
		if (message.equals("Thiru")) {
			System.out.println("Message is : " + message);
		}
		
	}
	
	public void m1() {
		System.out.println("for testing created m1()..");
	}
	
	public String newMessage(String message) {
		return "Welcome to git demo project..";
	}

	public static void main(String[] args) {
		System.out.println("inside main method...");
	}

}
