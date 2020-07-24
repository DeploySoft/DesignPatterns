package Prototype;

/**
 * <b>CONTRACT</b>
 * <br>
 * {@link IPrototype#clone()} <br>
 * {@link IPrototype#getType()} <br>
 * {@link IPrototype#execute()} <br>
 */
public interface IPrototype {

    IPrototype clone();

    TypeAuth getType();

    void execute();
}
