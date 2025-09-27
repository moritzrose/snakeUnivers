package org.snake_univers.SnakeUnivers.controller;

import org.snake_univers.SnakeUnivers.entities.PositionDTO;
import org.springframework.web.bind.annotation.*;

public interface CoordinateController {

    @PutMapping
    PositionDTO changePosition(@RequestBody PositionDTO positionRequestDTO);

    @GetMapping
    PositionDTO getPosition();
}
