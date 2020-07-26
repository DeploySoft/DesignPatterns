package CreationalPatterns.ObjectPool;


import java.time.Duration;
import java.util.Random;

public class Auth extends ObjectPool<Session> {


    public Auth() {
        super(Duration.ofSeconds(10L).toMillis());
    }

    @Override
    protected Session create() {
        System.out.println("Creating session...");
        return new Session(new Random().nextLong());
    }

    @Override
    public void expire(Session session) {
        System.out.println("Session will destroy " + session);
        session.setActive(false);
        System.out.println("Session was destroyed");
    }

    @Override
    public boolean validate(Session session) {
        return session.isActive();
    }
}