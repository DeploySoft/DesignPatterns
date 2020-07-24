package CreationalPatterns.AbstractFactory;

public class AuthWS extends AuthenticationFactory {


    @Override
    public Session creteSession(String user) {
        return new Session(1L, user, TypeAuth.WS);
    }

    @Override
    public Boolean destroySession() {
        return true;
    }

    public Boolean connect() {
        return true;
    }
}
