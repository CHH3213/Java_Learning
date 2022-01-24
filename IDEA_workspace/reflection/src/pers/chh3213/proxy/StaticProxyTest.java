package pers.chh3213.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.proxy
 * @ClassName : StaticProxyTest.java
 * @createTime : 2022/1/23 16:25
 * @Email :
 * @Description :
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类的对象
        ClothFactory erkeClothFactory = new ErkeClothFactory();
        //创建代理类的对象
        ClothFactory proxyClothFactory = new ProxyClothFactory(erkeClothFactory);
        proxyClothFactory.produceCloth();

    }
}
interface ClothFactory{
    void produceCloth();
}
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("准备");
        factory.produceCloth();
        System.out.println("生产服装");
    }

}

class ErkeClothFactory implements ClothFactory{
    @Override
    public void produceCloth() {
        System.out.println("鸿星尔克");
    }
}


