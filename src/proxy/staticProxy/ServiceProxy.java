package proxy.staticProxy;

public class ServiceProxy implements Service{
    Service service;

    public ServiceProxy(Service service){
        this.service=service;
    }

    public void setServiceProxy(Service service){
        this.service=service;
    }

    @Override
    public void echo() {
        System.out.println("ServiceProxy:echo start");
        service.echo();
        System.out.println("ServiceProxy:echo end");
    }

    @Override
    public int getService() {
        System.out.println("ServiceProxy:getService start");
        int id=service.getService();
        System.out.println("ServiceProxy:getService end");
        return id;
    }
}
