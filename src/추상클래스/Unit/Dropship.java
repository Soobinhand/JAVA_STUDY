package 추상클래스.Unit;

public class Dropship extends Unit{

    @Override
    void move(int x, int y) {
        /* 구현부 */
    }

    int total = 0;

    void load(){
        total++;
    }

    void unload(){
        total--;
    }
}
