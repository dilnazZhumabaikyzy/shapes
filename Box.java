import java.util.ArrayList;

public class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double availableVolume;

    public Box(double volume) {
        super(volume);
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

    b
}
