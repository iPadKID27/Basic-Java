public class Rectangle610 {
    private double length;
    private double width;

    public Rectangle610() {
        length = 0.0;
        width = 0.0;
    }

    public Rectangle610(double len, double w) {
        length = len;
        width = w;
    }

    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
