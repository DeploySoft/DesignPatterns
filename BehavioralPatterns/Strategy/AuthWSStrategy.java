package BehavioralPatterns.Strategy;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
abstract class AuthWSStrategy implements Strategy {

    public void doLogin(Session session) {
        setUser(session);
        setPass(session);
        goWebService(session);
    }

    abstract void setUser(Session session);

    abstract void setPass(Session session);

    abstract void goWebService(Session session);
}
