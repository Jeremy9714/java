package day03.test7;
/*
 * 工厂方法模式
 */
public class FactoryTest2 {

	public static void main(String[] args) {
		
		Car car1 = new BMWFactory().getCar();
		Car car2 = new BenzFactory().getCar();
		car1.run();
		car2.run();
	}
	
}
interface Car{
	void run();
}
class BMW implements Car{
	public void run() {
		System.out.println("BMW is running");
	}
}
class Benz implements Car{
	public void run() {
		System.out.println("Benz is running");
	}
}
//工厂接口
interface Factory{
	Car getCar();
}
class BMWFactory implements Factory{
	@Override
	public Car getCar() {
		return new BMW();
	}
}
class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		return new Benz();
	}
}