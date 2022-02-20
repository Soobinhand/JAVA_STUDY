package 추상클래스.Unit;

public class Tank extends Unit{

    @Override
    void move(int x, int y) {
        /* 구현부 */
    }

    boolean seizeMode = false;

    void changeMode(){
        seizeMode = !seizeMode;
    }
}
