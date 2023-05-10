package com.pmfsolutions.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmfsolutions.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{
    
}
