package com.leonardodeutsch.learnspringframework;

import com.leonardodeutsch.learnspringframework.game.MarioGame;
import com.leonardodeutsch.learnspringframework.game.SuperContraGame;

public class GameRunner {
    private SuperContraGame game;
    public GameRunner(SuperContraGame superContraGame) {
        this.game = superContraGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
