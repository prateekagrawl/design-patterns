package decorator;

public class Mushroom extends ToppingDecorator {

    //has a relationship with BasePizza
    BasePizza basePizza; 

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza; 
    }

    @Override
    public int cost() {
       return this.basePizza.cost() + 10;
    }
    
}
