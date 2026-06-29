package falcon3d.objects;

public abstract class Entity {

    protected float x;
    protected float y;
    protected float z;

    protected float rotationX;
    protected float rotationY;
    protected float rotationZ;

    protected float scale = 1.0f;

    public void setPosition(float x, float y, float z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setRotation(float x, float y, float z) {

        rotationX = x;
        rotationY = y;
        rotationZ = z;
    }

    public void setScale(float scale) {

        this.scale = scale;
    }

    public abstract void update();
}