package BehavioralPatterns.Template;

public class AuthAction extends AuthSession {

    @Override
    protected void confirmType(Session session) {
        System.out.println("The session id is " + session.getId());
    }

    @Override
    void checkSession(Session session) {
        System.out.println(session.toString());
    }
}
