package com.edu.vikson.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional5 {
	
	public static Supplier<String> supplierName(){		
		return ()->new String("supplierName");	
	}

	public static void main(String[] args) {
				
		Optional<String> optional=Optional.empty();
		
		System.out.println(supplierName().get());
		System.out.println(optional.orElseGet(supplierName()));
		System.out.println(optional.orElse(supplierName().get()));
	}

}
