package BehavioralPatterns.NullObject;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/20/2020, Thu
 **/
public class Start {
    public static void main(String[] args) {
        //same behaviour different action
        AuthGeneral authGeneral =  new AuthGeneral(new AuthDB());
        authGeneral.doSomething();
        AuthGeneral nullobject =  new AuthGeneral(new AuthWS());
        nullobject.doSomething();
    }
}
