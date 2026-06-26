package stackdemoproject;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> books = new Stack<String>();
		books.push("Java");
		books.push("Python");
		books.push("C++");
		
		System.out.println("Books in stack:" +books);
		
		//top book
		System.out.println("Top Book:"  +books.peek() );
		
		//remove books
		System.out.println("Removed Books"  +books.pop());
		
		//remaining books
		System.out.println("Removing Books" + books);
		

	}

}
