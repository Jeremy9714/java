package day02.junit;

import java.sql.Date;

import org.junit.Test;

public class jUnitDemo {
	int num = 10;
	@Test
	public void testEquals() {
		String s1 = "AA";
		String s2 = "BB";
		System.out.println(s1.equals(s2));
		
//		Object o = new String("GG");
//		Date d = (Date) o;
		
		//单元测试方法中可以直接调用属性，不需要初始化对象
		System.out.println(num);
	}
	
	@Test
	public void testToString() {
		System.out.println(num+"");
	}
}
