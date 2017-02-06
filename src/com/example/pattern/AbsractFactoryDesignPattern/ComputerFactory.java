package com.example.pattern.AbsractFactoryDesignPattern;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
