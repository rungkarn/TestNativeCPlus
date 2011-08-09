package org.example.hello;

public class FibLib {
	// Java implementation - recursive
	public static long fibJ(long n) { //
	if (n <= 0)
	return 0;
	if (n == 1)
	return 1;
	return fibJ(n - 1) + fibJ(n - 2);
	}
	// Java implementation - iterative
	public static long fibJI(long n) { //
	long previous = -1;
	long result = 1;
	for (long i = 0; i <= n; i++) {
	long sum = result + previous;
	previous = result;
	result = sum;
	}
	return result;
	}
	// Native implementation
	static {
	System.loadLibrary("fib"); //
	}
	// Native implementation - recursive
	public static native long fibN(int n); //
	// Native implementation - iterative
	public static native long fibNI(int n); //
		
}
