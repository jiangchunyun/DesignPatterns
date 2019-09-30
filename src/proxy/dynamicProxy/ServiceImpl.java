package proxy.dynamicProxy;
import proxy.staticProxy.Service;

public class ServiceImpl implements Service {
    @Override
    public void echo() {
        System.out.print("ServiceImpl");
    }

    @Override
    public int getService() {
        int serverId=1001;
        return serverId;
    }
}
