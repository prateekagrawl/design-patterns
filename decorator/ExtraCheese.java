package decorator;

public class ExtraCheese extends ToppingDecorator {

    //has a relationship with BasePizza
    BasePizza basePizza; 

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza; 
    }

    @Override
    public int cost() {
       return this.basePizza.cost() + 100;
    }
    
}
