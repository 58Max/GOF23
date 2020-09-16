package proxy.static_proxy;

public class Proxy {
    private Host host;

    public Proxy(){}

    public Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        seeHouse();
        leaseContract();
        fare();
        host.rent();
    }

    //看房子
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

    public void leaseContract(){
        System.out.println("签租赁合同");
    }
}
