package com.immutables;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImmutableStart {
	public static void main(String args[]) {
		Item item = ImmutableItem.builder().name("ABC").description("It is an Item").value(123).build();
		System.out.println("Item :"+item);
		
		Tuple tuple = ImmutableTuple.of(123, "tupleExample");
		System.out.println("Tuple :"+tuple);
	}
}
