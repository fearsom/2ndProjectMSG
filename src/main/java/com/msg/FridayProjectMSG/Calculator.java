package com.msg.FridayProjectMSG;

public class Calculator {

	interface calculate {
		double calcPriceWithTva(double price, Double tvaProc);

	}

	public double operate(double a, double b, calculate mathOP) {
		return mathOP.calcPriceWithTva(a, b);

	}
}
