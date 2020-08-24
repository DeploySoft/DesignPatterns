package BehavioralPatterns.State;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/23/2020, Sun
 **/
public class Off extends StateAuth {
    public void setState(Auth auth) {
        auth.setState(new On());
        System.out.println("Change state ON");
    }
}
