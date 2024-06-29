package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

//anotações referente à indicação de que é um controlador e mapeamento principal
@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    //Injetando objeto gameService
    @Autowired
    private GameService gameService;
    
    //mapeando para ao acessar /games listar todos os jogos
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
    
    //mapeando para ao acessar /games/*id* listar o jogo específico
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
}