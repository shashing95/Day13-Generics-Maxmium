package com.bridgelabz.genericsmaximum;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();

		findMaxInThree(a, b, c);
		sc.close();
	}

	public static Integer findMaxInThree(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0) {
			max = b;
		} else if (c.compareTo(max) > 0) {
			max = c;
		}

		return max;
	}

}
