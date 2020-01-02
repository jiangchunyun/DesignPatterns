package factory.simpleFactory;

public class ProduceLogin implements Login{
    @Override
    public void verify() {
        System.out.println("ProduceLogin----");
    }
}
