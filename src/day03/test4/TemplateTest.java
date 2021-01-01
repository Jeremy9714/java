package day03.test4;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new SubTemplate().spendTime();
	}
}

abstract class Template {
	public void spendTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public abstract void code();
}

class SubTemplate extends Template {

	@Override
	public void code() {
		int count = 0;
		label:for (int i = 1; i < 1000; ++i) {
			for (int j = 2; j <= Math.sqrt(i); ++j) {
				if (i % j == 0) {
					continue label;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}