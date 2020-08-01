package BehavioralPatterns.Visitor;

public interface Auth {

    void login(Session session);

    TypeAuth getTypeAuth();

}
