package enteties;

import exceptions.BadGameException;

public class TennisPlayer {

    public void play(int way) throws BadGameException {
        switch (way) {
            case 1: {
                System.out.println("Play as hard as he can");
                break;
            }
            case 2: {
                throw new BadGameException();
            }
            default: {
                System.out.println("Simple game");
            }
        }
    }

}
