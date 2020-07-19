package AbstractFactory;

public class AuthDB extends AuthenticationFactory {

    @Override
    public Session creteSession(String user) {
        //SCOPE CODE TO DO THE GOAL
        return new Session(1L, user, TypeAuth.DB);
    }

    @Override
    public Boolean destroySession() {
        return true;
    }
}
