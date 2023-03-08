package br.com.nat.infrastructure.mongodb;

import br.com.nat.domain.entities.Fish;
import br.com.nat.domain.repositories.FishRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FishMongoRepository implements FishRepository {
    MongoClient mongoClient;
    @Inject
    public FishMongoRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public Fish crateFish(Fish fish) {
          getCollection().insertOne(fish);
          return fish;

    }


    @Override
    public List<Fish> getAllFishs() {
        List<Fish> returnList = new ArrayList<>();
        getCollection().find().into(returnList);
        return returnList;
    }

    private MongoCollection<Fish> getCollection(){
            return mongoClient.getDatabase("fishStore").getCollection("Fish", Fish.class);

    }
}