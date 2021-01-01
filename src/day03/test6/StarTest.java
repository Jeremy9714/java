package day03.test6;
/*
 * 代理模式实例2
 */
public class StarTest {

	public static void main(String[] args) {
		//代理模式不暴露被代理对象
		RealStar realStar = new RealStar();
		Proxy proxy = new Proxy(realStar);
		proxy.signContract();
		proxy.sing();
		proxy.collectMoney();
	}

}
interface Star{
	void signContract();
	void sing();
	void collectMoney();
}
//被代理类
class RealStar implements Star{

	@Override
	public void signContract() {
		System.out.println("明星签合同");
	}

	@Override
	public void sing() {
		System.out.println("明星唱歌");
	}

	@Override
	public void collectMoney() {
		System.out.println("明星收钱");
	}
}
//代理类
class Proxy implements Star{
	
	private RealStar realStar;
	
	public Proxy(RealStar realStar) {
		this.realStar = realStar;
	}
	@Override
	public void signContract() {
		System.out.println("经纪人签合同");
	}

	@Override
	public void sing() {
		realStar.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人收钱");
	}
	
}