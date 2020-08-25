package BehavioralPatterns.ChainOfResponsibility;


public class StartClass {

    public static void main(String[] args) {
        Login[] inputLogin = {new AuthDB(), new AuthDB(), new AuthWS(), new AuthDB(), new AuthWS(), new AuthWS()};
        Processor[] processors = {new Processor(), new Processor(), new Processor()};
        for (int i = 0, j; i < inputLogin.length; i++) {
            System.out.println("Operation #" + (i + 1) + ":");
            j = 0;
            while (!processors[j].execute(inputLogin[i])) {
                j = (j + 1) % processors.length;
            }
            System.out.println();
        }
    }
}
