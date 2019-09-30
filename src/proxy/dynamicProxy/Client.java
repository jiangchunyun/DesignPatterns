package proxy.dynamicProxy;

import proxy.staticProxy.Service;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] argc){
        DynamicProxy dynamicProxy=new DynamicProxy(new ServiceImpl());
        System.getProperties().put("saveGeneratedFiles","true");
        Service service= (Service) Proxy.newProxyInstance(Service.class.getClassLoader(),new Class[]{Service.class},dynamicProxy);
        service.echo();
        service.getService();
    }
}
