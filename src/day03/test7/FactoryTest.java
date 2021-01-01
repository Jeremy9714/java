package day03.test7;
/*
 * 工厂模式实例1
 */
public class FactoryTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vehicle vehicle1 = CarFactory.getCar("Audi");
		Vehicle vehicle2 = CarFactory.getCar("BYD");
		vehicle1.run();
		vehicle2.run();
	}
}

interface Vehicle{
	void run();
}
class Audi implements Vehicle{
	public void run() {
		System.out.println("Audi is running");
	}
}
class BYD implements Vehicle{
	public void run() {
		System.out.println("BYD is running");
	}
}
//工厂类
class CarFactory{
	public static Vehicle getCar(String type) {
		if(type.equals("Audi")) {
			return new Audi();
		}else if(type.equals("BYD")) {
			return new BYD();
		}else {
			return null;
		}
	}
}