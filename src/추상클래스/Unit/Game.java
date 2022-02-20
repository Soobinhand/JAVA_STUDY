package 추상클래스.Unit;

public class Game {
    public static void main(String[] args) {
        Unit[] units = new Unit[4];
        units[0] = new Marine();
        units[1] = new Tank();
        units[2] = new Dropship();
        units[3] = new Marine();
        units[0].x = 1;
        units[0].y = 2;
        for (int i=0;i<units.length;i++){
            units[i].move(100,200);
        }
        System.out.println(units[0]);
    }
}
