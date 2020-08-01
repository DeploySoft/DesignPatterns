package BehavioralPatterns.Visitor;


public class StartClass {

    public static void main(String[] args) {
        Auth[] list = {new AuthDB(), new AuthWS()};
        for (Auth auth : list) {
            auth.login(new Session());
        }
    }
}
