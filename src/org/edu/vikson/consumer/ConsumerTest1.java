package org.edu.vikson.consumer;
import java.util.function.*;

public class ConsumerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Integer> consumer = i->System.out.println("Square of a numebr="+i*i); 
		consumer.accept(20);
		
		
		Consumer<String> consumer2 =s->System.out.println("my name is "+s);
		consumer2.accept("vikalp");
		
		Consumer<Integer> consumer3=i->System.out.println("cube of a number="+i*i*i);
		consumer3.accept(10);
		
		System.out.println("======================");
		
		consumer.andThen(consumer3).accept(3);
	}

}
