package CreationalPatterns.FactoryMethod;

public class Session {
    private Long id;
    private final TypeAuth typeAuth;

    public Session(TypeAuth typeAuth) {
        this.typeAuth = typeAuth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
