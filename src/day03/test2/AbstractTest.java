package day03.test2;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student s1 = new Student(6,"AA",12);
		s1.eat();
		s1.walk();
	}

}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void eat();

	public abstract void walk();
}

class Student extends Person {
	int grade;
	
	public Student() {
		
	}
	
	public Student(int grade, String name, int age) {
		super(name,age);
		this.grade = grade;
	}
	public void eat() {
		System.out.println("Student is eating");
	}
	
	public void walk() {
		System.out.println("Student is walking");
	}

	@Override
	public void breath() {
		// TODO 自动生成的方法存根
		
	}
}