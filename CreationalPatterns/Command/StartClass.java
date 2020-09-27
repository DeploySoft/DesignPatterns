package CreationalPatterns.Command;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 26/09/20
 **/
public class StartClass {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.add(new AuthDB());
        invoker.add(new AuthWS());
       invoker.execute();
       invoker.recover();
    }
}
