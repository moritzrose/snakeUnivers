package org.snake_univers.SnakeUnivers.repository;

import org.snake_univers.SnakeUnivers.entities.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository {
    Optional<Player> findByName(String name);
    void save(Player player);
    List<Player> findAll();
}
