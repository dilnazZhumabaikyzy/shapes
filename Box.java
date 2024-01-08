import java.util.ArrayList;

public class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double availableVolume;
    private double volume;

    public Box(double volume) {
        this.volume = volume;
        this.availableVolume = volume;
    }
    private boolean add(Shape shape){
        if(availableVolume >= shape.getVolume()) {
            shapes.add(shape);
            availableVolume -= shape.getVolume();
            return true;
        }

        return false;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
