package day03.test3;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person s = new Student();
		method(s);
		//抽象类的匿名子类
		Person s2 = new Person() {
			@Override
			public void eat() {
			}
			@Override
			public void walk() {
			}
		};
		method(s2);
	}
	
	public static void method(Person p) {
		p.eat();
		p.walk();
	}
}

abstract class Person{
	
	public Person() {
		
	}
	
	public abstract void eat();
	public abstract void walk();
}

class Student extends Person{
	
	public Student() {
		
	}
	
	@Override
	public void eat() {

	}

	@Override
	public void walk() {

	}
	
}