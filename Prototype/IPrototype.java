package Prototype;

public interface IPrototype {
    Session clone();

    String getName();

    void execute();
}
