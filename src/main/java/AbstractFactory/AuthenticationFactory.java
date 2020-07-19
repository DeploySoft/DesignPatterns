package AbstractFactory;

abstract class AuthenticationFactory {
    /**
     * @param typeAuth needless
     * @return
     */
    static AuthenticationFactory getFactory(TypeAuth typeAuth) {
        AuthenticationFactory authenticationFactory = null;
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


}


