package BehavioralPatterns.Visitor;

public class Session {
    private Long id;

    public void checkSession(Auth typeAuth) {
        System.out.println("Session was creates with " + typeAuth.getTypeAuth());
    }
}
