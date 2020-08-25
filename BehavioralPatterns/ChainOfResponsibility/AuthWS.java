package BehavioralPatterns.ChainOfResponsibility;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/24/2020, Mon
 **/
public class AuthWS implements Login {
    @Override
    public String login() {
        return "WS";
    }
}
