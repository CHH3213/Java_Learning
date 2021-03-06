package pers.chh3213.classLearn20211231;


interface Network {
	public void browse();
}
class RealServer implements Network {//真实服务器
	@Override
	public void browse() {
		System.out.println("真实服务器上网浏览信息");
	}
}


class ProxyServer implements Network {//代理服务器
	private Network network;
	public ProxyServer (Network network) {
		this.network = network;
	}
	public void check() {
		System.out.println("检查网络连接等操作");
	}
	public void browse() {
		check();
		network.browse();
	}
}
public class ProxyDemo {
	public static void main(String[] args) {
	Network net = new ProxyServer (new RealServer());//
	net. browse();
    }
}