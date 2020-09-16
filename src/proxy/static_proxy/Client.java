package proxy.static_proxy;

/**
 * 我们租房子只需要和中介接触就可以
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 房东想出租房子
         */
        Host host = new Host();

        /**
         * 中介帮房东出租房子
         */
        Proxy proxy = new Proxy(host);


    }
}
