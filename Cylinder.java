public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double height, double radius){
        super(Math.PI * height * height * radius, radius);
        this.height = height;
    }

}
