package day04.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) {

		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		method2();
	}
	
	public static void method2() {
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws IOException {
		method();
	}

	public static void method() throws FileNotFoundException, IOException {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		int data = fis.read();
		while (data != -1) {
			System.out.println((char) data);
			data = fis.read();
		}
		fis.close();
	}

}
