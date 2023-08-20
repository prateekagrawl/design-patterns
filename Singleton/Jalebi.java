package Singleton;

public class Jalebi {

    //Eager way of creating singleton object
    private static Jalebi jalebi = new Jalebi();

    //constructor
    private Jalebi(){

    }

    //Lazy pattern of creating Singleton pattern
    public static Jalebi getJalebi(){ //method created should always be static 
       return jalebi;
    }
}
