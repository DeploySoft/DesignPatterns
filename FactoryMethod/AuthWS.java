package FactoryMethod;


public class AuthWS implements IFactoryMethod {

    private final Session session;

    public AuthWS() {
        session = new Session(TypeAuth.WS);
    }

    @Override
    public Session getSession() {
        return session;
    }
}
