package org.snake_univers.SnakeUnivers.controller;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.snake_univers.SnakeUnivers.entities.DirectionalInput;
import org.springframework.web.bind.annotation.*;

public interface CoordinateController {

    @PostMapping
    Coordinates setPositon(@RequestBody Coordinates coordinates);

    @PutMapping
    Coordinates changePosition(@RequestBody DirectionalInput directionalInput);

    @GetMapping
    Coordinates getPosition();
}
