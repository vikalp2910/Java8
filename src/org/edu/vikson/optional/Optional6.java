package org.edu.vikson.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional6 {
	
	public  Supplier<? extends RuntimeException> supplierException(){
		return ()->new ArithmeticException();	
	}

	public static void main(String[] args) {
		
		Optional<String> optional=Optional.empty();;
		
		System.out.println(optional.orElseThrow(new Optional6().supplierException()));
		
		
		

	}

}
