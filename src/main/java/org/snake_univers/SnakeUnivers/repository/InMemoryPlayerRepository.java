package org.snake_univers.SnakeUnivers.repository;

import org.snake_univers.SnakeUnivers.entities.Player;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryPlayerRepository implements PlayerRepository{

    private final ConcurrentHashMap<String, Player> players = new ConcurrentHashMap<>();

    @Override
    public Optional<Player> findByName(String name) {
        return Optional.ofNullable(players.get(name));
    }

    @Override
    public void save(Player player) {
        final String playerName = player.name();
        players.put(playerName, player);
    }

    @Override
    public List<Player> findAll() {
        return null;
    }
}
