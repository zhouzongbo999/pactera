package com.pactera.util;

public class TDebug {

	private static boolean debug=true;
	public static void print(Object obj){
		if(debug)
			System.out.println("xxx "+obj);
	}
}
