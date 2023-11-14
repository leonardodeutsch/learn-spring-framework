package com.leonardodeutsch.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.leonardodeutsch.learnspringframework.game.GamingConsole;
import com.leonardodeutsch.learnspringframework.game.GameRunner;
import com.leonardodeutsch.learnspringframework.game.PacmanGame;


@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
