package org.snake_univers.SnakeUnivers.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.snake_univers.SnakeUnivers.entities.DirectionalInput;
import org.snake_univers.SnakeUnivers.service.Game;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player/coordinates")
public class PlayerCoordinatesController implements CoordinateController {

    private final Game game;

    PlayerCoordinatesController(Game game){
        this.game = game;
    }

    @Operation(
            summary = "Set the initial position of a game object"
    )
    @Override
    public Coordinates setPositon(Coordinates coordinates) {
        final double x = coordinates.x();
        final double y = coordinates.y();
        return game.setPosition(x, y);
    }

    @Operation(
            summary = "Change the position of a game object - works with right, left, up and down"
    )
    @Override
    public Coordinates changePosition(DirectionalInput directionalInput) {
        return game.changePosition(directionalInput);
    }

    @Operation(
            summary = "Get the position of a game object"
    )
    @Override
    public Coordinates getPosition() {
        return game.getPosition();
    }
}
