package com.philodelight.DraftDay.controller;

import com.philodelight.DraftDay.entity.Player;
import com.philodelight.DraftDay.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/players")
public class PlayerController {
    
    private final PlayerService playerService;
    
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @PostMapping
    public Player savePlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }
    
    @GetMapping
    public List<Player> getAll(){
        return playerService.getAllPlayers();
    }
}
