package CreationalPatterns.AbstractFactory.lambda;


import CreationalPatterns.AbstractFactory.AuthDB;
import CreationalPatterns.AbstractFactory.AuthWS;
import CreationalPatterns.AbstractFactory.AuthenticationFactory;
import CreationalPatterns.AbstractFactory.TypeAuth;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AuthenticationFactoryLambda {
    /**
     * @param typeAuth needless
     * @return {@link AuthenticationFactoryLambda}
     */
    static Map<TypeAuth, Supplier<AuthenticationFactory>> map = new HashMap<>();

    static {
        map.put(TypeAuth.DB, AuthDB::new);
        map.put(TypeAuth.WS, AuthWS::new);

    }

    static AuthenticationFactory getFactory(TypeAuth typeAuth) {
        Supplier<AuthenticationFactory> factory = map.get(typeAuth);
        if (factory != null) {
            return factory.get();
        }
       return defaultFactory();
    }

    private static AuthenticationFactory defaultFactory() {
        return map.get(TypeAuth.WS).get();
    }


}


