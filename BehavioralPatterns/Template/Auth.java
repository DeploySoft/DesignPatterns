package BehavioralPatterns.Template;

/**
 * <li>1. Standardize the skeleton of an algorithm in a base class "template" method</li>
 * <li>2. Common implementations of individual steps are defined in the base class</li>
 * <li>3. Steps requiring peculiar implementations are "placeholders" in base class</li>
 * <li>4. Derived classes can override placeholder methods</li>
 * <li>5. Derived classes can override implemented methods</li>
 * <li>6. Derived classes can override and "call back to" base class methods</li>
 */
public abstract class Auth {
    // 1. Standardize the skeleton of an algorithm in a "template" method
    void doLogin(Session session) {
        putUser(session);
        putPassword(session);
        putSession(session);
        checkSession(session);
    }

    // 2. Common implementations of individual steps are defined in base class
    private void putUser(Session session) {
        System.out.println(String.format("The user %s from template ", session.getUser()));
    }

    // 2. Common implementations of individual steps are defined in base class
    private void putPassword(Session session) {
        System.out.println(String.format("The user password %s from template ", session.getPassword()));
    }

    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract void putSession(Session session);

    abstract void checkSession(Session session);
}
