package day03.test1;

public class BlockTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Block block = new Block();
		Block block2 = new Block();
		System.out.println(Block.desc);
	}

}

class Block {
	String name;
	int age;
	static String desc;

	public Block() {

	}

	{
		System.out.println("代码块执行");
		name = "A";
		age = 18;
	}
	static {
		System.out.println("静态代码块执行");
		desc = "静态字符串";
	}
}