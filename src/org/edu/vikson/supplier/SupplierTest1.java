package org.edu.vikson.supplier;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest1 {

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
		LocalDateTime time=supplier.get();
		System.out.println(time);
		
	}

}
