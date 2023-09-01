package FactoryConceptCoding;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape obj = shapeFactory.getShape("CIRCLE");
        obj.draw();
        Shape obj1 = shapeFactory.getShape("RECTANGLE");
        obj1.draw();
    }
}
