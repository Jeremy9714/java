package day05.myproject.services;
/**
 * @description 表示员工的状态
 * @author Chenyang
 *
 */
public class Status {
	
	private Status() {
	}
	
	public static final Status FREE = new Status();
	public static final Status BUSY = new Status();
	public static final Status VACATION = new Status();
}
