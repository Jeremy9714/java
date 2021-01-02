package day04.test2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverWrittenTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		OverWrittenTest o = new OverWrittenTest();
		o.display(new SubClass());
	}
	
	public void display(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
class SuperClass{
	public void method() throws IOException{
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass{
	//子类重写的方法抛出的异常类型要小于等于父类抛出的异常类型
	public void method() throws FileNotFoundException{
		System.out.println("SubClass");
	}
}