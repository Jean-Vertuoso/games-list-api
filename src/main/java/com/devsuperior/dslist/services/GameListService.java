package com.devsuperior.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

//anotacao indicando que é um service
@Service
public class GameListService {
    
    //injecao da interface repository
    @Autowired
    private GameListRepository gameListRepository;
    
    //metodo para listar todos os jogos
    //anotacao de transacao que assegura que nao ira fazer nenhuma operacao de escrita
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
