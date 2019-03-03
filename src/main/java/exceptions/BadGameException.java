package exceptions;

public class BadGameException extends Exception {

    @Override
    public String getMessage() {
        return "Missed the ball";
    }
}
