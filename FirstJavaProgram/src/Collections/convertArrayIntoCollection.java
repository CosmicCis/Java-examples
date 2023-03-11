package Collections;

import java.util.*;
import java.io.*;

public class convertArrayIntoCollection {
	/*
Problem Description
How to convert an array into a collection?

Solution
Following example demonstrates to convert an array into a collection Arrays.asList(name) method of Java Util class.
	*/
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("How many elements you want to add to the array: ");
		int n = Integer.parseInt(in.readLine());
		String[] name = new String[n];

		for(int i = 0; i < n; i++) {
			name[i] = in.readLine();
		}
		List<String> list = Arrays.asList(name);
		System.out.println();

		for(String li: list) {
			String str = li;
			System.out.print(str + " ");
		}
	}
}
