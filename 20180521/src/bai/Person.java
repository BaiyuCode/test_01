package bai;

import java.io.Serializable;

public class Person implements Serializable{

	private String name;
	private int age;
	public Person(int age,String name) {
		this.age=age;
		this.name=name;
	}
}
