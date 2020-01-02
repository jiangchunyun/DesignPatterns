package factory.simpleFactory;

public class Client {
    public static void main(String[] argc) {
        Login stagingLogin =  LoginManager.factory("StagingLogin");
        Login produceLogin = LoginManager.factory("ProduceLogin");
        stagingLogin.verify();
        produceLogin.verify();
    }
}
