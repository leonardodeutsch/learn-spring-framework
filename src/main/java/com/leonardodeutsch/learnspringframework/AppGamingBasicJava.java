package com.leonardodeutsch.learnspringframework;

import com.leonardodeutsch.learnspringframework.game.MarioGame;
import com.leonardodeutsch.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
