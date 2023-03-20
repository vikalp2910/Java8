package org.edu.vikson.supplier;

public class SupplierTestPojo3 {
	
	private int id;
 	private String name;
	private String email;
	
	
	
	public SupplierTestPojo3() {
		super();
	}
	
	public SupplierTestPojo3(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "SupplierTestPojo3 [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
}
