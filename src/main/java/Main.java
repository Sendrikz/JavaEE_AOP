import enteties.TennisPlayer;
import exceptions.BadGameException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisPlayer player = context.getBean("player", TennisPlayer.class);
        try {
            player.play(1);
            System.out.println("#####################");
            player.play(2);
        } catch (BadGameException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*** AOP context");

        ApplicationContext aopContext = new ClassPathXmlApplicationContext("aopContext.xml");
        TennisPlayer aopPlayer = aopContext.getBean("playerAOP", TennisPlayer.class);
        try {
            aopPlayer.play(3);
        } catch (BadGameException e) {
            System.out.println(e.getMessage());
        }
    }
}
