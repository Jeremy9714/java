package day02.test1;

public class equalsTest {

	public static void main(String[] args) {
		User u1 = new User("A",12);
		User u2 = new User("a",12);
		System.out.println(u1.equals(u2));
	}

}

class User {
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		if(obj instanceof User) {
			User u = (User) obj;
			return u.name.equalsIgnoreCase(this.name) &&u.age==this.age;
		}
		return false;
	}
}