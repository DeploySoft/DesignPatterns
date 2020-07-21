package Singleton;

public class SingletonService {

    private static SingletonService instance;


    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

}
