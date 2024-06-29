package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

//interface responsavel pelo acesso aos dados do banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
