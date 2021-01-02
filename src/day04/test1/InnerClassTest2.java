package day04.test1;

public class InnerClassTest2 {

	public static void main(String[] args) {


	}

}

class Test {

	public Comparable getComparable() {

//		// 方式一
//		// 创建一个实现了Comparable接口的局部内部类
//		class MyComparable implements Comparable {
//
//			@Override
//			public int compareTo(Object o) {
//				// TODO 自动生成的方法存根
//				return 0;
//			}
//
//		}
//		return new MyComparable();
		
		//方式二
		//匿名类匿名对象
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO 自动生成的方法存根
				return 0;
			}
			
		};
	}

}