package org.edu.vikson.supplier;


import java.util.function.Supplier;

public class SupplierTest3 {

	public static void main(String[] args) {
	
		SupplierTestPojo3 object1= factory(SupplierTestPojo3::new);
		System.out.println(object1);
		
		SupplierTestPojo3 object2=  factory(()-> new SupplierTestPojo3(29,"vikalp","vikalp.edu@gmail.com"));
		System.out.println(object2);
		
	}
	
	public static SupplierTestPojo3 factory(Supplier<? extends SupplierTestPojo3> supplier) {
		
		SupplierTestPojo3 supplierTestPojo3=supplier.get();
		
		if(supplierTestPojo3.getId()==0) {
			supplierTestPojo3.setId(2910);
			supplierTestPojo3.setName("vikson");
			supplierTestPojo3.setEmail("vikson.edu@gmail.com");
		}
		
		
		return supplierTestPojo3;
	}
	
	

}
