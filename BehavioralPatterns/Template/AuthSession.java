package BehavioralPatterns.Template;

import java.util.Random;

public abstract class AuthSession extends Auth {
    // 4. Derived classes can override placeholder methods
    // 1. Standardize the skeleton of an algorithm in a "template" method
    protected void putSession(Session session) {
        session.setId(new Random().nextLong());
        setType(session);
        validateType(session);
    }

    // 2. Common implementations of individual steps are defined in base class
    private void setType(Session session) {
        session.setTypeAuth(TypeAuth.fromString(session.getStrategy()));
    }

    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract protected void confirmType(Session session);

    private void validateType(Session session) {
        System.out.println("Session type is " + session.getTypeAuth());
    }
}
