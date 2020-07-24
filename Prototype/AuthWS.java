package Prototype;

public class AuthWS implements IPrototype {
    private final TypeAuth typeAuth = TypeAuth.WS;

    @Override
    public IPrototype clone() {
        return new AuthWS();
    }

    @Override
    public TypeAuth getType() {
        return typeAuth;
    }

    @Override
    public void execute() {
        System.out.println("Executing Auth " + typeAuth);
    }
}
