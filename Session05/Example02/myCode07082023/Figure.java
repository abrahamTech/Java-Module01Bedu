package Session05.Example02.myCode07082023;

public class Figure {
    private final double BASE;
    private final double HEIGHT;

    public Figure(double base, double height) {
        this.BASE = base;
        this.HEIGHT = height;
    }

    public double getBASE() {
        return BASE;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }


    public void showDimension() {
        System.out.println("Figure's base: " + BASE);
        System.out.println("Figure's height: " + HEIGHT);
    }
}
