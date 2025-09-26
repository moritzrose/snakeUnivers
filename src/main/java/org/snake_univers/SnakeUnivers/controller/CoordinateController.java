package org.snake_univers.SnakeUnivers.controller;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.springframework.web.bind.annotation.*;

public interface CoordinateController {

    @PostMapping
    Coordinates setPosition(@RequestBody Coordinates coordinates);

    @PutMapping
    Coordinates changePosition(@RequestBody Coordinates coordinates);

    @GetMapping
    Coordinates getPosition();
}
