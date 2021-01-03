package day05.myproject.junit;

import org.junit.Test;

import day05.myproject.domain.*;
import day05.myproject.services.*;

public class NameListServiceTest {

	@Test
	public void test1() {
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股份\t领用设备");

		NameListService n = new NameListService();
		Employee[] employees = n.getAllEmployees();
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
	
	@Test
	public void test2() {
		try {
			NameListService n = new NameListService();
			Employee employee = n.getEmployee(0);
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股份\t领用设备");
			System.out.println(employee);
		}catch(TeamException e) {
			System.out.println(e.getMessage());
		}
	}
}
