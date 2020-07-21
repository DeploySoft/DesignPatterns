package FactoryMethod;


public class AuthDB implements IFactoryMethod {

    private final Session session;

    public AuthDB() {
        session = new Session(TypeAuth.DB);
    }

    @Override
    public Session getSession() {
        return session;
    }
}
