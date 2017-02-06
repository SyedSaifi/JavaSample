package com.example.pattern.DecoratorDesignPattern;


/*Decorator pattern allows to add new functionality an existing 
 * object without altering its structure. 
 * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
 * Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 */
public class DecoratorPatternDemo {
	   public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
	}