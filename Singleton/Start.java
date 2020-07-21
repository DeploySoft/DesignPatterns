package Singleton;

public class Start {
    public SingletonService singletonService;
    public SingletonService singletonService2;
    public SingletonService singletonService3;

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
        singletonService3 = new SingletonService();
        //It Will be true
        System.out.println(singletonService == singletonService2);
        //it will be false
        System.out.println(singletonService2 == singletonService3);
    }


}
