public class Ball extends SolidOfRevolution{
    private double radius;

    public Ball(double radius){
        super( radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}
