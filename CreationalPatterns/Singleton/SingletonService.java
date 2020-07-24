package CreationalPatterns.Singleton;

public class SingletonService {

    private static SingletonObject instance;

    public SingletonService() {
        throw new UnsupportedOperationException();
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

}

class SingletonObject {

}