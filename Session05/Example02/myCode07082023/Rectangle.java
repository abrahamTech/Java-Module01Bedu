package Session05.Example02.myCode07082023;

public class Rectangle extends Figure {
    
    public Rectangle(double base, double height) {
        super(base, height);
    }

    public double getArea() {
        return getBASE() * getHEIGHT();
    }
}
