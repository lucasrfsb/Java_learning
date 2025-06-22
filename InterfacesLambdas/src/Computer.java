public class Computer implements VideoPlayer, MusicPlayer{    @Override
    public void playVideo() {
        System.out.println("O computer está tocando o video\n");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computer está pausando o video\n");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computer está parando o video\n");
    }

    @Override
    public void playMusic() {
        System.out.println("O computer está tocando a musica\n");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computer está pausando a musica\n");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computer está parando a musica\n");
    }
}
