package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Prototype</b> should have
 * <ul>
 *     <li>CONTRACT {@link IPrototype}</li>
 *     <li>REGISTRY {@link PrototypeModule#prototypes}</li>
 *     <li>WAY FOR POPULATE REGISTRY {@link PrototypeModule#addPrototype(IPrototype)}</li>
 *     <li>VIRTUAL CONSTRUCTOR {@link PrototypeModule#createPrototype(String)}</li>
 *     <li>CLASSES USING CONTRACT {@link AuthWS} {@link AuthBD}</li>
 *     <li>DON'T USE NEW {@link StartClass#main(String[])}</li>
 * </ul>
 *
 * For executing this class needs params
 * java Prototype.StartClass WebServices,DataBase
 */
public class StartClass {

    public static void main(String[] args) {
        initializePrototypes();
        List<IPrototype> prototypes = new ArrayList<>();
        for (String protoName : args) {
            IPrototype prototype = PrototypeModule.createPrototype(protoName);
            if (prototype != null) {
                prototypes.add(prototype);
            }
        }
        for (IPrototype p : prototypes) {
            p.execute();
        }
    }


    public static void initializePrototypes() {
        PrototypeModule.addPrototype(new AuthWS());
        PrototypeModule.addPrototype(new AuthBD());
    }
}


class PrototypeModule {
    // "registry" of prototypical objs
    private static final List<IPrototype> prototypes = new ArrayList<>();

    // Adds a feature to the Prototype attribute of the PrototypesModule class
    // obj  The feature to be added to the Prototype attribute
    public static void addPrototype(IPrototype p) {
        prototypes.add(p);
    }

    public static IPrototype createPrototype(String name) {
        for (IPrototype p : prototypes) {
            if (p.getType().getType().equals(name)) {
                return p.clone();
            }
        }
        System.out.println(name + ": doesn't exist");
        return null;
    }
}