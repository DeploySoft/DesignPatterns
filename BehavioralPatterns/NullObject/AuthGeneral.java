package BehavioralPatterns.NullObject;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/20/2020, Thu
 **/
public class AuthGeneral {
    private final AbstractAuth abstractAuth;

    public AuthGeneral(AbstractAuth abstractAuth) {
        this.abstractAuth = abstractAuth;
    }

    public void doSomething() {
        this.abstractAuth.doLogin();
    }
}
