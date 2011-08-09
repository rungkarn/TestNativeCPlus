package org.example.hello;

public class MatchLib {
	// Native implementation
	static {
	System.loadLibrary("match"); //
	}
	// Native implementation - recursive
	public static native String matching(String strFileName);
	//public static native long matching(String strFileName);
}
