package com.pmfsolutions.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmfsolutions.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
    
}
