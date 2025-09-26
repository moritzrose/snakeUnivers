package org.snake_univers.SnakeUnivers.service;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.springframework.stereotype.Service;

@Service
public class Game {
    private double x;
    private double y;

    public Coordinates changePosition(Coordinates coordinates) {
        x += coordinates.x();
        y += coordinates.y();
        return new Coordinates(x, y);
    }

    public Coordinates getPosition() {
        return new Coordinates(x,y);
    }
}
