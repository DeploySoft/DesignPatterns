package CreationalPatterns.Singleton;


public class Start {
    public SingletonObject singletonService;
    public SingletonObject singletonService2;
    public SingletonObject singletonService3;

    public Start() {
    }

    public static void main(String[] args) {
        new Start().start();
    }

    public void start() {
        //Singleton
        singletonService = SingletonService.getInstance();
        singletonService2 = SingletonService.getInstance();
        //New object on memory
        singletonService3 = new SingletonObject();
        //It Will be true
        System.out.println(singletonService == singletonService2);
        //it will be false
        System.out.println(singletonService2 == singletonService3);
    }


}
