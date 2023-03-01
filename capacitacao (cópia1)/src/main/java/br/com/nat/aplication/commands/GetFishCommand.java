package br.com.nat.aplication.commands;

import br.com.nat.domain.entities.Fish;
import br.com.nat.domain.repositories.FishRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GetFishCommand {;
    @Inject
    FishRepository fishRepository;

    public List<Fish> escecute (){
        return fishRepository.getAllFishs();
    }
}
