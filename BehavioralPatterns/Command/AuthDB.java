package BehavioralPatterns.Command;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 26/09/20
 **/
public class AuthDB implements ICommand {


    @Override
    public void execute() {
        System.out.println("Execute from DB");
    }

    @Override
    public void recover() {
        System.out.println("recover from DB");

    }
}
