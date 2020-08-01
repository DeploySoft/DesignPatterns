package BehavioralPatterns.Visitor;

public class AuthWS implements Auth {

    private TypeAuth typeAuth = TypeAuth.WS;

    @Override
    public void login(Session session) {
        session.checkSession(this);
    }

    public TypeAuth getTypeAuth() {
        return typeAuth;
    }
}
