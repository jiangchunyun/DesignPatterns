package proxy.staticProxy;

public class Client {
    public static void main(String[] argc){
        Service service=new ServiceImpl();
        Service serviceProxy=new ServiceProxy(service);
        serviceProxy.echo();
        System.out.println(serviceProxy.getService());
    }
}
