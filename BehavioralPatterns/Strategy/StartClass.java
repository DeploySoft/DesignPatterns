package BehavioralPatterns.Strategy;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
public class StartClass {

    public static void main(String[] args) {
        Strategy[] waysToDoLogin = {new AuthDB(), new AuthWS()};
        for (Strategy strategy : waysToDoLogin) {
            strategy.doLogin(new Session("user", "pass"));
        }
    }
}
