package falcon3d.objects;

public class Cube extends Entity {

    @Override
    public void update() {

        rotationY += 1.0f;

        if (rotationY >= 360.0f) {

            rotationY = 0.0f;
        }
    }
}