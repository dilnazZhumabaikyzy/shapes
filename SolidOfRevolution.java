public class SolidOfRevolution extends Shape{
    private double raduis;

    public SolidOfRevolution(double volume, double raduis){
        super(volume);
        this.raduis = raduis;

    }

    public double getRaduis() {
        return raduis;
    }
}
