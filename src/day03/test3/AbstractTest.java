package day03.test3;

public class AbstractTest {

	public static void main(String[] args) {
		// 非匿名类，非匿名对象
		Person s0 = new Student();
		method(s0);

		// 非匿名类，匿名的对象
		method(new Student());

		// 抽象类的匿名子类，非匿名的对象
		Person s2 = new Person() {
			//该类相当于一个没有名字的Person的子类
			@Override
			public void eat() {
			}
			@Override
			public void walk() {
			}
			@Override
			public void breath() {
			}
		};
		method(s2);

		// 匿名的类匿名的对象
		method(new Person() {
			@Override
			public void eat() {
				System.out.println("new eat");
			}
			@Override
			public void walk() {
				System.out.println("new walk");
			}
			@Override
			public void breath() {
			}
		});
	}

	public static void method(Person p) {
		p.eat();
		p.walk();
		p.sleep();
		p.breath();
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature {

	public Person() {
	}

	public abstract void eat();

	public abstract void walk();
	
	public void sleep() {
		System.out.println("Person is sleeping");
	}
}

class Student extends Person {

	public Student() {
	}

	@Override
	public void eat() {
		System.out.println("Student is eating");
	}

	@Override
	public void walk() {
		System.out.println("Student is walking");
	}

	@Override
	public void breath() {
		System.out.println("Student is breathing");
	}
}