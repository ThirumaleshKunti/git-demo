package com.git.demo;

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
<<<<<<< HEAD

=======
	public void addedmthod1(){
		System.out.println("added a method from another developer: ");
	}
>>>>>>> ff059e2f21eda6579165c186f6d02f737c8e38b3
	public String newMessage(String message) {
		return "Welcome to git demo project..";
	}

	public static void main(String[] args) {
		System.out.println("inside main method...");
	}

}
