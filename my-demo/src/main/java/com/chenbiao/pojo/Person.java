package com.chenbiao.pojo;

/**
 * @author chenbiao
 * @version 1.0
 * @description
 * @date 2022/4/6 16:59
 */
public class Person {
	private String name;

	private int age;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
