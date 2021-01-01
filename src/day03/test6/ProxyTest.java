package day03.test6;
/*
 * 代理模式
 */
public class ProxyTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	}

}

interface Network{
	public void browse();
}

//被代理类
class Server implements Network{

	@Override
	public void browse() {
		System.out.println("服务器访问网络");
	}
}
//代理类
class ProxyServer implements Network{

	private Network work;
	
	public ProxyServer(Network work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("联网前的检查工作");
	}
	
	@Override
	public void browse() {
		check();
		work.browse();
	}
}

