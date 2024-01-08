public class Piramyd extends Shape{
    private double height;
    private double s;

    public Piramyd(double height, double s) {
        this.height = height;
        this.s = s;
    }


    @Override
    public double getVolume() {
        return height * s * 4 / 3;
    }
}
