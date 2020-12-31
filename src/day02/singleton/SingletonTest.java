package day02.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Singleton s = Singleton.getInstance();
		System.out.println(s.getClass().getName());
		Singleton2 s2 = Singleton2.getInstance();
		System.out.println(s2.getClass().getName());
	}

}

//饿汉式
class Singleton {

	private Singleton() {
	}

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
}

//懒汉式
class Singleton2 {
	private Singleton2() {

	}

	private static Singleton2 instance = null;

	public static Singleton2 getInstance() {
		if(instance==null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
