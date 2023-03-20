package org.edu.vikson.supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest2<T> {

    public static void main(String[] args) {
    	
   SupplierTest2<String> object1=new SupplierTest2<String>();
   List<String> list1= object1.getList().get();
   
   list1.add("vikalp");
   list1.add("sonkar");
   System.out.println(list1);
   
   SupplierTest2<Integer> object2=new SupplierTest2();
   List<Integer> list2=object2.getList().get();
   
   list2.add(29);
   list2.add(2910);
   System.out.println(list2);
   
   SupplierTest2<SupplierTestPojo3> object3=new SupplierTest2();
   List<SupplierTestPojo3> list3=object3.getList().get();
   
   list3.add( new SupplierTestPojo3());
   list3.add( new SupplierTestPojo3(29,"vikalp","vikalp.edu@gmail.com"));
   System.out.println(list3);
   
    }
    
    public  Supplier<List<T>> getList(){
        //return ()->new ArrayList<T>();
		return ArrayList::new;  	
    }
    
}