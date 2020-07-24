package CreationalPatterns.Prototype;

public enum TypeAuth {
    DB("DataBase"), WS("WebServices");

    private final String type;

    TypeAuth(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
