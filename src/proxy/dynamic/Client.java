package proxy.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 *  一个动态代理类代理的是一个接口 一般代理一个接口实现的业务
 */
public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //没有真实的代理角色
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //通过调用程序处理角色设置我们要调用的接口对象
        invocationHandler.setProxy(host);

        Rent proxy = (Rent) invocationHandler.getProxy();

        proxy.rent();
    }
}
