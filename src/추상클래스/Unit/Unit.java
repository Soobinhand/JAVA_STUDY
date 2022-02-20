package 추상클래스.Unit;

public abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){}

    @Override
    public String toString() {
        return "Unit{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
