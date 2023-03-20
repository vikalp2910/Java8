package org.edu.vikson.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest1 {

	public static void main(String[] args) {
		
	BiConsumer<Integer, Integer> biConsumer=(a,b)->System.out.println("sum="+ (a+b)) ;
	biConsumer.accept(10, 20);
	
	BiConsumer<Float, String> biConsumer2=(a,b)->{
		System.out.println("candidate name="+b +" && candidate aggregate="+a);
		};
    biConsumer2.accept(75.5f, "vikalp Sonkar");
    
    BiConsumer<Integer, Integer> biConsumer3=(a,b)->System.out.println("Doublesum="+ (a+b)*2) ;
	biConsumer3.accept(1, 2);
	
	System.out.println("========================");
	
	biConsumer.andThen(biConsumer3).accept(2, 5);
	
	
	}

}
