package BehavioralPatterns.Memento;


public class StartClass {

    public static void main(String[] args) {
        Auth auth = new Auth();
        auth.setState("valid");
        State stateSaved = auth.save();
        System.out.println(auth.toString());
        auth.setState("invalid");
        System.out.println(auth.toString());
        auth.restore(stateSaved);
        System.out.println(auth.toString());
    }
}
