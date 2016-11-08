/**
 * Copyright NEWFOUND SYSTEMS to Present
 * All Rights Reserved
 */
package com.examples.generics;

public interface Calculator<T extends Number> {
	T add(T x, T y);
	T multiply(T x, T y);
	T subtract(T x, T y);
	T divide(T x, T y);
}
