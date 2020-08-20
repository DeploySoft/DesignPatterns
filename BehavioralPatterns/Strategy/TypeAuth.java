package BehavioralPatterns.Strategy;

public enum TypeAuth {
    DB("DataBase"), WS("WebServices");

    private final String type;

    TypeAuth(String type) {
        this.type = type;
    }


    public static TypeAuth fromString(String text) {
        for (TypeAuth b : TypeAuth.values()) {
            if (b.type.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
