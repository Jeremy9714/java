package day04.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public void test1() {
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			int data = fis.read();
			while(data!=-1) {
				System.out.println((char)data);
				data = fis.read();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("一定会执行的语句");
			try {
				if(fis!=null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void returnTest() {
		int num = method1();
		System.out.println(num);
	}
	public int method1() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("一定会执行的语句");
			//finally块一定会执行，所以在catch块return之前，会先在执行finally块中的return语句
			return 3;
		}
	}
}
