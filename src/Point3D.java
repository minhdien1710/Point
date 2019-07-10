public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D() {
    }

    Point3D(float z){

    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();

        return array;
    }
    @Override
    public String toString(){
        return "toa do cua diem (" + getX() +","+getY()+","+getZ()+")" ;

    }
}
