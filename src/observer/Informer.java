package observer;

public interface Informer {
    void add(Observer observer);
    void delete(Observer observer);
    void onform();
}
