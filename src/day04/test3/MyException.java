package day04.test3;

/*
 * 自定义异常类
 * 1. 继承与现有的异常结构：RuntimeException、Exception
 * 2. 提供全局常量: serialVersionUID
 * 3. 提供重载的构造器
 */
public class MyException extends Exception{
	//序列版本号
	static final long serialVersionUID = -7034897190245766939L;
	
	public MyException() {
	}
	//重载构造器
	public MyException(String msg) {
		super(msg);
	}
}
