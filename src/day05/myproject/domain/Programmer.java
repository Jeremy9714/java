package day05.myproject.domain;

import day05.myproject.services.Status;

public class Programmer extends Employee {
	private int memberId;
	protected Status status = Status.FREE;
	protected Equipment equipment;

	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return getDetails() + "\t程序员\t" + getStatus().getName() + "\t\t\t" + equipment.getDescription();
	}

}
