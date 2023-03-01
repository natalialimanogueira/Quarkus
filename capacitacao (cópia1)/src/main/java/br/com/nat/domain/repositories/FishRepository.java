package br.com.nat.domain.repositories;

import br.com.nat.domain.entities.Fish;

import java.util.List;

//@ApplicationScoped                     // ao colocar essa anotação da erro
    public interface FishRepository {
    public List<Fish> getAllFishs();

}