package org.edu.vikson.optional;

import java.util.Optional;

public class Optional7 {

	public static void main(String[] args) {
		
		var optional= Optional.ofNullable(null);
		System.out.println(optional.isPresent());

	}

}
