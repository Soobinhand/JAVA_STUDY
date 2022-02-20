package 추상클래스.Player;

public class CDPlayer extends Player{
    @Override
    void play(int pos) {
        /* 구현부 */
    }

    @Override
    void stop() {
        /* 구현부 */
    }

    //CDPlayer 만의 다른 메소드들
    int currentTrack;
    void nextTrack(){
        currentTrack++;
    }

    void preTrack(){
        if (currentTrack > 1){
            currentTrack--;
        }
    }
}
