package day04.test1;

public class InnerClassTest {

	public static void main(String[] args) {
		// 静态成员内部类实例化
		Person.DD dd = new Person.DD();
		Person p = new Person();
		Person.EE ee = p.new EE("EE");
		dd.show();
		ee.sing();
		ee.display("display");
	}

}

class Person {

	String name;
	int age;

	public void breath() {
		System.out.println("Breathing");
	}

	// 成员内部类(静态)
	// 成员内部类可以被四种权限修饰符修饰
	protected static class DD {
		String name;
		int age;

		public void show() {
			System.out.println("DD is showing");
		}
	}

	// 成员内部类(非静态)
	public final class EE {
		String name;

		public EE(String name) {
			this.name = name;
		}

		public void sing() {
			System.out.println("EE is singing");
			//调用外部类非静态属性
			Person.this.breath();
		}

		public void display(String name) {
			//形参
			System.out.println(name);
			//内部类属性
			System.out.println(this.name);
			//外部类属性
			System.out.println(Person.this.name);
			//无重名情况
			System.out.println(age);
		}
	}

	// 成员内部类
	abstract class FF {
		String name;
		int age;

		public void show() {
			System.out.println("该类无法被实例化");
		}
	}

	public Person() {
		// 局部内部类
		class CC {

		}
		name = "Person";
		age = 12;
	}

	public void method() {
		// 局部内部类
		class AA {

		}
	}

	{
		// 局部内部类
		class BB {

		}
	}
}