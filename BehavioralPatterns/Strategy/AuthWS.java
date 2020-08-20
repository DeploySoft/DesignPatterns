package BehavioralPatterns.Strategy;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
public class AuthWS extends AuthWSStrategy {

    @Override
    void setUser(Session session) {
        System.out.println("User from " + this.getClass().getCanonicalName() + " " + session.getUser());
    }

    @Override
    void setPass(Session session) {
        System.out.println("Password from " + this.getClass().getCanonicalName() + " " + session.getPassword());

    }

    @Override
    void goWebService(Session session) {
        session.setTypeAuth(TypeAuth.WS);
        System.out.println("Set value WS in typeAuth from " + this.getClass().getCanonicalName() + " " + session.getTypeAuth());
    }
}
