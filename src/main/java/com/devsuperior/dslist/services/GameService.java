package com.devsuperior.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//anotacao indicando que é um service
@Service
public class GameService {
    
    //injecao da interface repository
    @Autowired
    private GameRepository gameRepository;
    
    //metodo para listar todos os jogos
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
        
    }
    
    //metodo para listar jogo pelo id
    //anotacao de transacao que assegura que nao ira fazer nenhuma operacao de escrita
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
