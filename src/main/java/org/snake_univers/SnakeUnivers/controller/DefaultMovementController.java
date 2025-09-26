package org.snake_univers.SnakeUnivers.controller;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.snake_univers.SnakeUnivers.service.Game;
import org.springframework.web.bind.annotation.RequestBody;

public class DefaultMovementController implements PositionController {

    private final Game game;

    DefaultMovementController(Game game){
        this.game = game;
    }

    @Override
    public Coordinates changePosition(@RequestBody Coordinates coordinates) {
        return game.changePosition(coordinates);
    }

    @Override
    public Coordinates getPosition() {
        return game.getPosition();
    }
}
