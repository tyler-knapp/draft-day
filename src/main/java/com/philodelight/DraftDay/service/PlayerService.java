package com.philodelight.DraftDay.service;

import com.philodelight.DraftDay.entity.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {
    
    Player savePlayer(Player player);
    
    List<Player> getAllPlayers();
}
