package enteties;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* enteties.TennisPlayer.play(..))")
    public void play() {}

    @Before("play()")
    public void takeSeats() {
        System.out.println("The audience taking seats ...");
    }

    @AfterReturning("play()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("play()")
    public void badReaction() {
        System.out.println("Booo! Boooo!");
    }

}
