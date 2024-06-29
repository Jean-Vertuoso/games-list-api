package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//indicacao de entidade e criacao da tabela de associacao tb_belonging
@Entity
@Table(name="tb_belonging")
public class Belonging {
    
    private Integer position;
    
    //indicacao de id unificando duas chaves estrangeiras
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        this.position = position;
        id.setGame(game);
        id.setList(list);
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Belonging other = (Belonging) obj;
        return Objects.equals(this.id, other.id);
    }
}
