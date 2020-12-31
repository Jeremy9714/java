package day02.tostring;

public class toStringDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		toStringDemo t = new toStringDemo();
		//当输出一个对象的引用时，自动调用toString方法
		System.out.println(t);
	}
	
	public String toString() {
		return "重写的方法";
	}
}