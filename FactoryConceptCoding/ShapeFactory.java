package FactoryConceptCoding;

public class ShapeFactory {
    
    Shape getShape(String key){
        
        switch(key) {
            case "CIRCLE": 
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default :
                return null;
        }
    }
}
