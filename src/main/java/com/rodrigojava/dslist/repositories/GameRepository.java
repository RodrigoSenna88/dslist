package com.rodrigojava.dslist.repositories;

import com.rodrigojava.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
