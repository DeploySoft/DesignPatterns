package BehavioralPatterns.Command;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 26/09/20
 **/
public interface ICommand {

    void execute();

    void recover();
}
