package BehavioralPatterns.Strategy;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
public class AuthDB extends AuthDBStrategy {

    @Override
    void setUser(Session session) {
        System.out.println("User from " + this.getClass().getCanonicalName() + " " + session.getUser());
    }

    @Override
    void setPass(Session session) {
        System.out.println("Password from " + this.getClass().getCanonicalName() + " " + session.getPassword());

    }

    @Override
    void goDataBase(Session session) {
        session.setTypeAuth(TypeAuth.DB);
        System.out.println("Set value DB in typeAuth from " + this.getClass().getCanonicalName() + " " + session.getTypeAuth());
    }
}
