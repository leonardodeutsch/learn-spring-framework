package com.leonardodeutsch.learnspringframework;

import com.leonardodeutsch.learnspringframework.game.GameRunner;
import com.leonardodeutsch.learnspringframework.game.MarioGame;
import com.leonardodeutsch.learnspringframework.game.SuperContraGame;
import com.leonardodeutsch.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
