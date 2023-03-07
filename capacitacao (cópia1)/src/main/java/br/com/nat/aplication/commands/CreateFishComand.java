package br.com.nat.aplication.commands;

import br.com.nat.domain.repositories.FishRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateFishComand {
    @Inject
    FishRepository fishRepository;

    public Boolean criateFish(){
        fishRepository.crateFish();
        return true;

    }


}
