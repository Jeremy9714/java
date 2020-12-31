package day02.test1;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<Object> v = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		while(true) {
			System.out.println("输入学生成绩(-1代表结束程序)");
			int mark = scanner.nextInt();
			if(mark<0) {
				break;
			}
			if(mark>100) {
				System.out.println("错误的分数，请重新输入");
			}else {
				if(mark>max) {
					max=mark;
				}
				v.addElement(mark);
			}
		}
		for(int i=0;i<v.size();++i) {
			Object obj = v.elementAt(i);
//			Integer in = (Integer) obj;
//			int mark = in.intValue();
			int mark = (int) obj;
			if(max-mark<=10) {
				System.out.println("分数为: "+mark + " 等级为: A");
			}else if(max-mark<=20) {
				System.out.println("分数为: "+mark + " 等级为: B");
			}else {
				System.out.println("分数为: "+mark + " 等级为: C");
			}
		}
	}
}
