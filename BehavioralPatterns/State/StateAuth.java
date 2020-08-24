package BehavioralPatterns.State;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/23/2020, Sun
 **/
abstract class StateAuth {
    public void setState(Auth auth) {
        auth.setState(new On());
        System.out.println("Set ON in Auth");
    }
}
