package day05.myproject.view;

import java.util.*;

/**
 * @description 项目中提供了TSUtility类，可用来方便的实现键盘访问
 * @author Chenyang
 *
 */
public class TSUtility {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @description 该方法读取键盘，如果用户输入1~4中的任意字符，则返回该字符；否则需要重新输入
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String line = readKeyBoard(1, false);
			c = line.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("错误的选择，请重新输入");
			} else
				break;
		}
		return c;
	}

	/**
	 * @description 该方法提示并等待，直到用户按回车键后返回
	 */
	public static void readReturn() {
		System.out.println("按回车键继续...");
		readKeyBoard(100, true);
	}

	/**
	 * @description 该方法从键盘读入一个长度不超过2位的整数，并作为该方法的返回值
	 */
	public static int readInt() {
		int n;
		for (;;) {
			String line = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("数字输入错误，请重新输入");
			}
		}
		return n;
	}

	/**
	 * @description 从键盘读入'Y'或'N'，并将其作为该方法的返回值
	 */
	public static char readConfirmSelection() {
		char c;
		for (;;) {
			String line = readKeyBoard(1, false);
			c = line.toUpperCase().charAt(0);
			if (c != 'Y' && c != 'N') {
				System.out.println("选择错误，请重新输入");
			} else
				break;
		}
		return c;
	}

	/**
	 * @description 该方法用于从键盘读取数据
	 */
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			if (line.length() == 0) {
				if (blankReturn)
					return line;
				else
					continue;
			}

			if (line.length() < 1 || line.length() > limit) {
				System.out.println("输入长度不大于" + limit + "，请重新输入");
				continue;
			}
			break;
		}
		return line;
	}
}
