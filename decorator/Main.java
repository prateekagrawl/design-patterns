package decorator;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza =  new ExtraCheese(new Margherita());
        System.out.println("The cost of pizza with extra cheese is " + pizza.cost());
        
        BasePizza pizza1 =  new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("The cost of pizza with extra cheese and mushroom is is " + pizza1.cost());
    }
}
