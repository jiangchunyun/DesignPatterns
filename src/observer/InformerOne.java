package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InformerOne implements Informer{
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void onform() {
        Iterator iterator=observers.iterator();
        while(iterator.hasNext()){
            Observer observer= (Observer) iterator.next();
            observer.update();
        }
    }
}
