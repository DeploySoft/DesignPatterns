package BehavioralPatterns.Visitor;

public class AuthDB implements Auth {

    private TypeAuth typeAuth = TypeAuth.DB;

    @Override
    public void login(Session session) {
        session.checkSession(this);
    }

    public TypeAuth getTypeAuth() {
        return typeAuth;
    }
}
