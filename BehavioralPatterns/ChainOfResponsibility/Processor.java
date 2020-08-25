package BehavioralPatterns.ChainOfResponsibility;

import java.util.Random;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/24/2020, Mon
 **/
public class Processor {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;

    public boolean execute(Login login) {
        if (RANDOM.nextInt(2) != 0) {
            System.out.println("Processor " + id + " is busy");
            return false;
        }
        System.out.println("Processor " + id + " - " + login.login());
        return true;
    }
}
