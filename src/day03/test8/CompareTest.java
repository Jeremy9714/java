package day03.test8;

public class CompareTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CompareCircleDemo c1 = new CompareCircleDemo(3.4);
		CompareCircleDemo c2 = new CompareCircleDemo(3.6);
		int compareValue = c1.compareTo(c2);
		if(compareValue>0) {
			System.out.println("c1半径更长");
		}else if(compareValue<0) {
			System.out.println("c2半径更长");
		}else {
			System.out.println("c1和c2半径一样长");
		}
		try {
			compareValue = c1.compareTo(new String("AA"));
			System.out.println(compareValue);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

interface CompareCircle{
	int compareTo(Object o);
}

class Circle{
	
	private Double radius;
	public Circle() {
	}
	public Circle(Double radius) {
		this();
		this.radius=radius;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}

class CompareCircleDemo extends Circle implements CompareCircle{
	
	public CompareCircleDemo(double radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof CompareCircleDemo) {
			CompareCircleDemo c = (CompareCircleDemo) o;
//			if(c.getRadius()>this.getRadius()) {
//				return -1;
//			}else if(c.getRadius()<this.getRadius()) {
//				return 1;
//			}else {
//				return 0;
//			}
			//使用Double包装类自带的compareTo方法进行比较
			return this.getRadius().compareTo(c.getRadius());
		}else {
			throw new RuntimeException("类型不匹配");
		}
	}
}