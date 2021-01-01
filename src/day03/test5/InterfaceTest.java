package day03.test5;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		Plane plane = new Plane();
		plane.fly();
		plane.stop();
		SmallKite smallKite = new SmallKite();
		smallKite.fly();
		smallKite.stop();
	}

}

interface Flyable {
	//JDK7.0以及之前的版本中，接口中只能定义全局常量和抽象方法
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1; //可以省略public static final，但是实际上还是全局常量
	
	public abstract void fly();
	void stop();//可以省略public abstract
	
	//接口中不能定义构造器
}

//接口与接口之间可以继承或多继承
interface Attackable{
	void attack();
}
interface AA{
	void method1();
}
interface BB{
	void method2();
}
interface CC extends AA, BB{	
}

//Java类可以继承父类并且实现多个接口
class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void fly() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void attack() {
	}

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速飞行");
	}
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		System.out.println("风筝在飞");
	}
}

class SmallKite extends Kite{

	@Override
	public void stop() {
		System.out.println("小风筝停了");
	}
	
}