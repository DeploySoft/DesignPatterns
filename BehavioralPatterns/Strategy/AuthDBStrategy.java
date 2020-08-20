package BehavioralPatterns.Strategy;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
abstract class AuthDBStrategy implements Strategy {

    public void doLogin(Session session) {
        setUser(session);
        setPass(session);
        goDataBase(session);
    }

    abstract void setUser(Session session);

    abstract void setPass(Session session);

    abstract void goDataBase(Session session);
}
