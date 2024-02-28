package programowanie.zadanie8;

public class Parcel{
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }
    public void setExpress(boolean isExpress) {
        this.isExpress = isExpress;
    }

}
