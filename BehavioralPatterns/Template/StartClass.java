package BehavioralPatterns.Template;


public class StartClass {

    public static void main(String[] args) {
        Auth auth = new AuthAction();
        Session session = new Session("user", "password", "DataBase");
        auth.doLogin(session);
    }
}
