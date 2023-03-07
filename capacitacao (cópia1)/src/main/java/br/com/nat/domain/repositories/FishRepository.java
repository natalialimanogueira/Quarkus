package br.com.nat.domain.repositories;

import br.com.nat.domain.entities.Fish;

import java.util.List;

public interface FishRepository {
     List<Fish> getAllFishs();
     void insertFish();
     Fish crateFish();
}