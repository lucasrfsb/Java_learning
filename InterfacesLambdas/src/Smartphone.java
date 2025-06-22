public class Smartphone implements MusicPlayer, VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("O smartphone está tocando o video\n");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando o video\n");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está parando o video\n");
    }

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando a musica\n");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a musica\n");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando a musica\n");
    }
}
