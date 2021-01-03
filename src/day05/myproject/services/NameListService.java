package day05.myproject.services;

import day05.myproject.domain.*;
import static day05.myproject.services.Data.*;// 导入该类下的所有静态结构

/**
 * @description 负责将Data中的数据封装到Employee[]数组中,同时提供相关操作Employee数组的方法
 * @author Chenyang
 *
 */
public class NameListService {
	private Employee[] employees;

	public NameListService() {
		this.employees = new Employee[EMPLOYEES.length];
		for (int i = 0; i < employees.length; ++i) {
			// 获取通用的属性
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;

			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
	}

	// 获取对应员工的设备
	private Equipment createEquipment(int index) {
		int type = Integer.parseInt(EQUIPMENTS[index][0]);// 设备类型
		String model = EQUIPMENTS[index][1];

		switch (type) {
		case PC:
			String display = EQUIPMENTS[index][2];
			return new PC(model, display);
		case NOTEBOOK:
			int price = Integer.parseInt(EQUIPMENTS[index][2]);
			return new NoteBook(model, price);
		case PRINTER:
			String pType = EQUIPMENTS[index][2];
			return new Printer(model, pType);
		}
		return null;
	}
	
	/**
	 * @description 获取所有的员工
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	/**
	 * @description 获取指定id的员工
	 * @param id
	 * @return
	 * @throws TeamException
	 */
	public Employee getEmployee(int id) throws TeamException{
		for(Employee e:employees) {
			if(e.getId()==id) {
				return e;
			}
		}
		throw new TeamException("错误的id信息");
	}

}
