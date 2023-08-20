package Singleton;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {
        // Samosa s1 = Samosa.getSamosa();
        // System.out.println(s1.hashCode());
        // Samosa s2 = Samosa.getSamosa();
        // System.out.println(s2.hashCode());
        // System.out.println(Jalebi.getJalebi().hashCode());
        // System.out.println(Jalebi.getJalebi().hashCode());

        // System.out.println(Samosa.getSamosa().hashCode());

        ESamosa samosa = ESamosa.INSTANCE;
        System.out.println(samosa.hashCode());

        // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());

        // * will give us an error and singleton pattern won't break since there is no constructor for enum
        Constructor<ESamosa> constructor = ESamosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ESamosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());


    }
}
