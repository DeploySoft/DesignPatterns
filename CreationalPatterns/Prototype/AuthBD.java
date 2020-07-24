package CreationalPatterns.Prototype;

public class AuthBD implements IPrototype {
    private final TypeAuth typeAuth = TypeAuth.DB;

    @Override
    public IPrototype clone() {
        return new AuthBD();
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
