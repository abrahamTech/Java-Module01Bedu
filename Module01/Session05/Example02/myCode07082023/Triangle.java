package Session05.Example02.myCode07082023;

public class Triangle extends Figure {
    private final String TYPE;
    
    public Triangle(double base, double height, String type) {
        //"super" -> Mother Class Constructor
        super(base, height);
        //Native variables from this Class
        TYPE = type;
    }

    public String getTYPE() {
        return TYPE;
    }

    public double getArea() {
        return getBASE() * getHEIGHT() / 2;
    }

}
