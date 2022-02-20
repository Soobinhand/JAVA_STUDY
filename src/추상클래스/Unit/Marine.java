package 추상클래스.Unit;

public class Marine extends Unit{
    @Override
    void move(int x, int y) {
        /* 구현부 */
        this.x = x;
        this.y = y;
    }

    int speed = 0;
    int HP = 100;

    void stimPack(){
        speed++;
        HP -= 10;
    }
}
