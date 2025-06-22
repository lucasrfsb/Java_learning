import keyword.Client;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
//        runMusic(musicPlayer);
//        runVideo(musicPlayer);
//        lambdaTest();
//        lambdaTest2();
        testKeywords();

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void lambdaTest() {               // Lambda
        List<User> users = List.of(new User("Lucas", 28), new User("Joao", 30));
        users.forEach(user -> {
            System.out.println(user);
        });
        printStringValue(user -> user.name(), users); //user.name() pode ser substituido por um metodo de referencia user::name
    }

    public static void lambdaTest2() {          //Interface funcional, que é a base pra criação do Lambda
        List<User> users = List.of(new User("Lucas", 28), new User("Joao", 30));
        var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println((user));
            }
        };
        users.forEach(consumer);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
//        System.out.println(callback.apply);
    }

    private static void testKeywords() {

        var client = new Client();
        client.setName("Joao");
        System.out.println(client.getName());

    }
}