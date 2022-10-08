package com.philodelight.DraftDay.service;

import com.philodelight.DraftDay.entity.Player;
import com.philodelight.DraftDay.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{
    
    private final PlayerRepository playerRepository;
    
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    
    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }
    
    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
