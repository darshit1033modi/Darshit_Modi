package com.darshit.dataprocessor.controller;

import trialDemo.StringConverter;

public class DataHandler {

	public static void main(String[] args) {
		
		String data = "hello World";
		
		StringConverter converter = new StringConverter();
		System.out.println(converter.uppercaseConverter(data));
		System.out.println(converter.lowercaseConverter(data));
		System.out.println(converter.stringReverser(data));
		
	}
	
}
