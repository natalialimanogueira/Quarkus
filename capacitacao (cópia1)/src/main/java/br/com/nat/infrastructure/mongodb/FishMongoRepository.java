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
    public Fish crateFish() {
        Fish fish = new Fish();
        fish.setName("Bacalhau");
        fish.setSea(true);
        return fish;

    }
    @Override
    public void insertFish() {
        getCollection().insertOne(crateFish());
    }

    @Override
    public List<Fish> getAllFishs() {
        return getCollection().find().into(new ArrayList<>());
    }

    private MongoCollection<Fish> getCollection(){
            return mongoClient.getDatabase("fishStore").getCollection("Fish", Fish.class);

    }
}