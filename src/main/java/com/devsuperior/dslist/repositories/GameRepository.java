package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//interface responsavel pelo acesso aos dados do banco de dados
public interface GameRepository extends JpaRepository<Game, Long>{
    
}
