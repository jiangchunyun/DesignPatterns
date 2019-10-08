package observer;

public class ObserverTwo implements Observer{
    @Override
    public void update() {
        System.out.println("update--two");
    }
}
