package BehavioralPatterns.State;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/23/2020, Sun
 **/
public class On extends StateAuth {
    public void setState(Auth auth) {
        auth.setState(new Off());
        System.out.println("Change state OFF");
    }
}
