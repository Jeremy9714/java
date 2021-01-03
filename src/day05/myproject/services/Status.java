package day05.myproject.services;
/**
 * @description 表示员工的状态
 * @author Chenyang
 *
 */
public class Status {
	private String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	//枚举出三个对象
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VACATION = new Status("VACATION");
	
	public String getName() {
		return NAME;
	}
	
	public String toString() {
		return NAME;
	}
}
