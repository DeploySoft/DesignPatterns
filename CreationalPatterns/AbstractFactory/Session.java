package CreationalPatterns.AbstractFactory;

public class Session {

    public Session(Long id, String user, TypeAuth typeAuth) {
        this.id = id;
        this.user = user;
        this.typeAuth = typeAuth;
    }

    private Long id;
    private String user;
    private TypeAuth typeAuth;

    public TypeAuth getTypeAuth() {
        return typeAuth;
    }

    public void setTypeAuth(TypeAuth typeAuth) {
        this.typeAuth = typeAuth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AbstracFactory.Session{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", typeAuth=" + typeAuth +
                '}';
    }
}
