package org.snake_univers.SnakeUnivers.service;

import org.snake_univers.SnakeUnivers.entities.Coordinates;
import org.snake_univers.SnakeUnivers.entities.DirectionalInput;
import org.springframework.stereotype.Service;

@Service
public class Game {
    private double x;
    private double y;

    private static final String RIGHT = "right";
    private static final String LEFT = "left";
    private static final String UP = "up";
    private static final String DOWN = "down";

    public Coordinates setPosition(double x, double y){
        this.x = x;
        this.y = y;

        return new Coordinates(this.x, this.y);
    }

    public Coordinates getPosition() {
        return new Coordinates(x, y);
    }

    public Coordinates changePosition(DirectionalInput directionalInput) {
        if (RIGHT.equals(directionalInput.direction())) {
            return changePosition(1.0, 0.0);
        }
        if (LEFT.equals(directionalInput.direction())) {
            return changePosition(-1.0, 0.0);
        }
        if (UP.equals(directionalInput.direction())) {
            return changePosition(0.0, 1.0);
        }
        if (DOWN.equals(directionalInput.direction())) {
            return changePosition(0.0, -1.0);
        }
        return new Coordinates(x, y);
    }

    private Coordinates changePosition(double x, double y) {
        this.x += x;
        this.y += y;
        return new Coordinates(this.x, this.y);
    }
}
