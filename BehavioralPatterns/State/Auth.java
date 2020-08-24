package BehavioralPatterns.State;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/23/2020, Sun
 **/
public class Auth {
    private StateAuth stateAuth;

    public Auth() {
        this.stateAuth = new Off();
    }

    public void setState(StateAuth state) {
        this.stateAuth = state;
    }

    public void set() {
        this.stateAuth.setState(this);
    }
}
