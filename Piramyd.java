public class Piramyd extends Shape{
    private double height;
    private double s;

    public Piramyd(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}
