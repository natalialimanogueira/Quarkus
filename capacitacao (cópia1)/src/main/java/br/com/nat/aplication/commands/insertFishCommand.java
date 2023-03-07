package br.com.nat.aplication.commands;

import br.com.nat.domain.repositories.FishRepository;
import com.oracle.svm.core.annotate.Inject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class insertFishCommand {
    @Inject
    FishRepository fishRepository;

    public void insertFishComand(){
        fishRepository.insertFish();

    }
}
