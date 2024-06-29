package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

//anotações referente à indicação de que é um controlador e mapeamento principal
@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    //Injetando objeto gameService
    @Autowired
    private GameListService gameListService;
    
    //mapeando para ao acessar /games listar todos os jogos
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}