package CreationalPatterns.Command;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 26/09/20
 **/
public class AuthWS implements ICommand {
    @Override
    public void execute() {
        System.out.println("execute from WS");
    }

    @Override
    public void recover() {
        System.out.println("recover from WS");


    }
}
