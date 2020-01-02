package factory.simpleFactory;

public class LoginManager {
    public static Login factory(String type){
        if (type == "StagingLogin") {
          return new StagingLogin();
        } else if (type == "ProduceLogin") {
          return new ProduceLogin();
        } else {
            throw new RuntimeException("No type");
        }
    }
}
