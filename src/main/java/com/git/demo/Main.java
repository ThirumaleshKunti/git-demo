package com.git.demo;

public class Main {

	public void getMessage(String message) {
		System.out.println("Message : " + message);
		if (message.equals("Thiru")) {
			System.out.println("Message is : " + message);
		}
		
	}
	public void addedmthod1(){
		System.out.println("added a method from another developer: ");
	}
	public String newMessage(String message) {
		return "Welcome to git demo project..";
	}

	public static void main(String[] args) {
		System.out.println("inside main method...");
	}

}
