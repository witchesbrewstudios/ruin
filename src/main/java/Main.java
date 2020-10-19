import engine.GameEngine;
import engine.interfaces.GameLogic;

public class Main {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            GameLogic gameLogic = new GameLogicImpl();
            GameEngine gameEng = new GameEngine("Ruin", 600, 480, vSync, gameLogic);
            gameEng.run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}