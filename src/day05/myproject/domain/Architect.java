package day05.myproject.domain;

public class Architect extends Designer {
	private int stock;

	public Architect() {
		// TODO 自动生成的构造函数存根
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return getDetails() + "\t架构师\t" + getStatus().getName() + "\t" + bonus + "\t" + stock + "\t" + equipment.getDescription();
	}

}
