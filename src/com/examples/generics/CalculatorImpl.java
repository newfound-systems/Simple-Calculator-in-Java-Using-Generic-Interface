/**
 * Copyright NEWFOUND SYSTEMS to Present
 * All Rights Reserved
 */
package com.examples.generics;

public class CalculatorImpl implements Calculator<Number> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.generics.Calculator#add(java.lang.Number,
	 * java.lang.Number)
	 */
	@Override
	public Number add(Number x, Number y) {
		Number result = 0;
		if (x instanceof Integer) {
			result = x.intValue() + y.intValue();
		}
		if (x instanceof Float) {
			result = x.floatValue() + y.floatValue();
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.generics.Calculator#multiply(java.lang.Number,
	 * java.lang.Number)
	 */
	@Override
	public Number multiply(Number x, Number y) {
		Number result = 0;
		if (x instanceof Integer) {
			result = x.intValue() * y.intValue();
		}
		if (x instanceof Float) {
			result = x.floatValue() * y.floatValue();
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.generics.Calculator#subtract(java.lang.Number,
	 * java.lang.Number)
	 */
	@Override
	public Number subtract(Number x, Number y) {
		Number result = 0;
		if (x instanceof Integer) {
			result = x.intValue() - y.intValue();
		}
		if (x instanceof Float) {
			result = x.floatValue() - y.floatValue();
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.examples.generics.Calculator#divide(java.lang.Number,
	 * java.lang.Number)
	 */
	@Override
	public Number divide(Number x, Number y) {
		Number result = 0;
		if (x instanceof Integer) {
			result = x.intValue() / y.intValue();
		}
		if (x instanceof Float) {
			result = x.floatValue() / y.floatValue();
		}
		return result;
	}

	/**
	 * Main
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		{
			CalculatorImpl intCalc = new CalculatorImpl();
			Integer a = 10;
			Integer b = 5;
			System.out.println("---Input Numbers are a: " + a + " b: " + b);
			System.out.println("Integer Add: " + intCalc.add(a, b));
			System.out.println("Integer Multiply: " + intCalc.multiply(a, b));
			System.out.println("Integer Subtract: " + intCalc.subtract(a, b));
			System.out.println("Integer Divide: " + intCalc.divide(a, b));
		}

		System.out.println("----------------------");
		{
			CalculatorImpl floatCalc = new CalculatorImpl();
			Float a = 30.50f;
			Float b = 6.0f;
			System.out.println("---Input Numbers are a: " + a + " b: " + b);
			System.out.println("Float Add: " + floatCalc.add(a, b));
			System.out.println("Float Multiply: " + floatCalc.multiply(a, b));
			System.out.println("Float Subtract: " + floatCalc.subtract(a, b));
			System.out.println("Float Divide: " + floatCalc.divide(a, b));
		}
	}
}
