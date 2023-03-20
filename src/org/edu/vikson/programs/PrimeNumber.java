package org.edu.vikson.programs;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrime(5));
		System.out.println(isPrimelambda(11));

	}
	
	public static boolean isPrime(int number) {
		boolean isDivisble=false;
		
		for (int i=2 ; i<number ;i++) {
			if(number%i==0) {
				isDivisble=true;
				break;
			}
		}
		
		return !isDivisble;
	}
	
	public static boolean isPrimelambda(int number) {
		
		
		return IntStream.range(2, number).noneMatch(n->number%n==0);
	}

}
