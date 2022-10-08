package com.philodelight.DraftDay.repository;

import com.philodelight.DraftDay.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository  extends JpaRepository<Player, Long> {

}
