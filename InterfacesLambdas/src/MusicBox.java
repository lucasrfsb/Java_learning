public class MusicBox implements  MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A caixa de som está tocando a musica\n");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de som está pausando a musica\n");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de som está parando a musica\n");
    }
}
