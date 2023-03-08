package br.com.nat.aplication.commands;

import br.com.nat.domain.entities.Fish;
import br.com.nat.domain.repositories.FishRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateFishComand {
    @Inject
    FishRepository fishRepository;

    public Fish criateFish(Fish fish){
        return fishRepository.crateFish(fish);


    }


}
