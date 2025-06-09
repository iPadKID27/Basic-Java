public class Rectangle2 {
    private double length;
    private double width;
    
    public Rectangle2(double len, double w) {
        this.length = len;
        this.width = w;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getArea() {
      return this.length * this.width;
   }
}