package BehavioralPatterns.ChainOfResponsibility;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/24/2020, Mon
 **/
public class AuthDB implements Login {
    @Override
    public String login() {
        return "DB";
    }
}
