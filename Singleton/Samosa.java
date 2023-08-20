package Singleton;

public class Samosa {

    private static Samosa samosa;

    //* private constructor
    private Samosa(){
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }

    // Lazy pattern of creating Singleton pattern -> NOT THREAD SAFE
    // means if multiple threads come concurrently here, dono will create object kyunki unhe null milega
    public static Samosa getSamosa(){ //! method created should always be static kyunki Class should call this function
       if(samosa == null){

        //the synchronized block code will be executed by one thread at a time
        synchronized(Samosa.class){ 
                samosa = new Samosa(); 
        }
    }
       return samosa;
    }
}


//method synchronization -> ek time pe ek hi thread can execute the function, but has drawback of slowing our processing
//synchronized block -> wait for the time first block is getting executed.

