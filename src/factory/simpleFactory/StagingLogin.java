package factory.simpleFactory;

public class StagingLogin implements Login{
    @Override
    public void verify() {
        System.out.println("StagingLogin---");
    }
}
