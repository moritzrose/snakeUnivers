package org.snake_univers.SnakeUnivers.controller;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.snake_univers.SnakeUnivers.service.Game;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player/coordinates")
public class PlayerCoordinatestController implements CoordinateController {

    private final Game game;

    PlayerCoordinatestController(Game game){
        this.game = game;
    }

    @Override
    public Coordinates setPosition(Coordinates coordinates) {
        return game.setPosition(coordinates);
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
