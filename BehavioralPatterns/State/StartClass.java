package BehavioralPatterns.State;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/19/2020, Wed
 **/
public class StartClass {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        Auth auth = new Auth();
        while (true) {
            System.out.print("Press 'Enter'");
            is.read();
            auth.set();
        }
    }
}
