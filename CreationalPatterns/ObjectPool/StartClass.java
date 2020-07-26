package CreationalPatterns.ObjectPool;

import java.time.Duration;

public class StartClass {

    public static void main(String[] args) throws InterruptedException {
        Auth auth = new Auth();
        Session session = auth.checkOut();
        System.out.println("Session 1 is " + session.getId() + " with state " + session.isActive());
        auth.checkIn(session);

        //You'll get the same session because is valid the previous session in the pool
        Session session2 = auth.checkOut();
        System.out.println("Session 2 is " + session2.getId() + " with state " + session2.isActive());
        auth.checkIn(session2);

        Thread.sleep(Duration.ofSeconds(15L).toMillis());

        //You'll get other session because previous session has expired
        Session session3 = auth.checkOut();

        System.out.println("Session 3 is " + session3.getId() + " with state " + session3.isActive());
        //The previous session is valid but invalid and doesn't available in the pool
        System.out.println("Session 1 is " + session.getId() + " with state " + session.isActive());
        auth.checkIn(session3);
    }

}
