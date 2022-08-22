package com.bridgelabz.genericsmaximum;

public class MaxmiumUsingGenericMethod {
	public static <t extends Comparable> t getMax(t first,t second,t third) {
		t max;
		if(first.compareTo(second)>0 && first.compareTo(third)>0) {
			max=first;
		} else if(second.compareTo(first)>0 && second.compareTo(third)>0) {
			max=second;
		} else {
			max=third;
		}
		return max;
	}
}

