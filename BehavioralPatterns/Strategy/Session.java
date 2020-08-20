package BehavioralPatterns.Strategy;


public class Session {
    private String user;
    private String password;
    private String strategy;
    private Long id;
    private TypeAuth typeAuth;

    public Session(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTypeAuth(TypeAuth typeAuth) {
        this.typeAuth = typeAuth;
    }

    public String getStrategy() {
        return strategy;
    }

    public TypeAuth getTypeAuth() {
        return typeAuth;
    }

    @Override
    public String toString() {
        return "Session{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", strategy='" + strategy + '\'' +
                ", id=" + id +
                ", typeAuth=" + typeAuth +
                '}';
    }
}
