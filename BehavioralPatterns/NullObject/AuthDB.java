package BehavioralPatterns.NullObject;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/20/2020, Thu
 **/
public class AuthDB extends AbstractAuth{
    @Override
    void doLogin() {
        System.out.println("With action");
    }
}
