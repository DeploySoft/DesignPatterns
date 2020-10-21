package CreationalPatterns.AbstractFactory;

public abstract class AuthenticationFactory {
    /**
     * @param typeAuth needless
     * @return {@link AuthenticationFactory}
     */
    static AuthenticationFactory getFactory(TypeAuth typeAuth) {
        AuthenticationFactory authenticationFactory;
        switch (typeAuth) {
            case DB:
                authenticationFactory = new AuthDB();
                break;
            case WS:
                authenticationFactory = new AuthWS();
                break;
            default:
                authenticationFactory = new AuthWS();
        }
        return authenticationFactory;
    }

    public abstract Session creteSession(String user);

    public abstract Boolean destroySession();

    public abstract String fromWhere();


}


