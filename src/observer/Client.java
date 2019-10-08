package observer;

public class Client {
    public static void main(String[] argc){
        Informer informer=new InformerOne();
        Observer observer1=new ObserverOne();
        Observer observer2=new ObserverTwo();

        informer.add(observer1);
        informer.add(observer2);

        informer.onform();
    }
}
