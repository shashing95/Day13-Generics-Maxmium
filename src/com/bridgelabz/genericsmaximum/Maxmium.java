package com.bridgelabz.genericsmaximum;

public class Maxmium {
	public static int getMax(Integer first,Integer second,Integer third) {
		int max;
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


