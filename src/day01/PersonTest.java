package day01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p = new Person("mike",18,true);
		p.eat();
		p.talk();
	}

}
class Person{
	String name;
	int age;
	boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public void eat() {
		System.out.println("进食");
	}
	
	public void talk() {
		System.out.println("说话");
	}
}