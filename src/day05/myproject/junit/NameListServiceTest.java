package day05.myproject.junit;
import org.junit.Test;

import day05.myproject.domain.*;
import day05.myproject.services.*;

public class NameListServiceTest {

	@Test
	public void test1(){
		System.out.println("id\t名字\t年龄\t薪水\t设备\t\t奖金\t股份");
		try {
			NameListService n = new NameListService();
			Employee[] employees = n.getAllEmployees();
			for(Employee e:employees) {
				System.out.println(e);
			}
			n.getEmployee(0);
		} catch (TeamException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
