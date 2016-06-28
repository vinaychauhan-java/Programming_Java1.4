package com.java.vinay.inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyInputOutputExample1 {
	public static void main(String args[]) throws IOException {
		char c;
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Enter character, 'Q' for quit");
		do {
			c = (char) isr.read();
			System.out.print(c);
		} while (c != 'Q');

		// Create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character, 'Q' for quit");
		// read characters
		do {
			c = (char) br.read();
			System.out.print(c);
		} while (c != 'Q');
	}
}